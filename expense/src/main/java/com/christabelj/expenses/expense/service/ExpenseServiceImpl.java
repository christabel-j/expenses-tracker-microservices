package com.christabelj.expenses.expense.service;

import com.christabelj.expenses.expense.domain.dto.request.CreateExpenseRequestDto;
import com.christabelj.expenses.expense.domain.dto.request.UpdateExpenseRequestDto;
import com.christabelj.expenses.expense.domain.dto.response.ExpenseResponseDto;
import com.christabelj.expenses.expense.domain.entity.Expense;
import com.christabelj.expenses.expense.exception.ExpenseNotFoundException;
import com.christabelj.expenses.expense.mapper.ExpenseMapper;
import com.christabelj.expenses.expense.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ExpenseServiceImpl implements ExpenseService {
    private final ExpenseMapper expenseMapper;
    private final ExpenseRepository expenseRepository;

    @Override
    public ExpenseResponseDto createExpense(CreateExpenseRequestDto requestDto) {
        Expense entity = expenseMapper.toEntity(requestDto);
        Expense savedEntity = expenseRepository.save(entity);
        return expenseMapper.toResponseDto(savedEntity);
    }

    @Override
    public List<ExpenseResponseDto> getAllExpenses() {
        return expenseRepository.findAll()
                .stream()
                .map(expenseMapper::toResponseDto)
                .toList();
    }

    @Override
    public ExpenseResponseDto getExpenseById(UUID id) {
        Expense expense = expenseRepository.findById(id)
                .orElseThrow(() -> new ExpenseNotFoundException("Expense with this id not found."));
        return expenseMapper.toResponseDto(expense);
    }

    @Override
    public ExpenseResponseDto updateExpense(UUID id, UpdateExpenseRequestDto requestDto) {
        Expense expenseToUpdate = expenseRepository.findById(id) // find existing entity in db
                .orElseThrow(()-> new ExpenseNotFoundException("Error - category you want to update has not been found or doesn't exist."));

        // changing to match the update request
        expenseToUpdate.setAmount(requestDto.amount());
        expenseToUpdate.setDescription(requestDto.description());
        expenseToUpdate.setCategoryId(requestDto.categoryId());
        expenseToUpdate.setDate(requestDto.date());

        Expense updatedExpense = expenseRepository.save(expenseToUpdate);

        return expenseMapper.toResponseDto(updatedExpense);
    }

    @Override
    public void deleteExpense(UUID id) {
        expenseRepository.deleteById(id);
    }
}
