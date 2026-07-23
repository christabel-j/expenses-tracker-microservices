package com.christabelj.expenses.expense.service;

import com.christabelj.expenses.expense.domain.dto.request.CreateExpenseRequestDto;
import com.christabelj.expenses.expense.domain.dto.request.UpdateExpenseRequestDto;
import com.christabelj.expenses.expense.domain.dto.response.ExpenseResponseDto;

import java.util.List;
import java.util.UUID;

public interface ExpenseService {

    // create expense
    ExpenseResponseDto createExpense(CreateExpenseRequestDto requestDto);

    // read all expenses
    List<ExpenseResponseDto> getAllExpenses();

    // read 1 expense
    ExpenseResponseDto getExpenseById(UUID id);

    // update an expense
    ExpenseResponseDto updateExpense(UUID id, UpdateExpenseRequestDto requestDto);

    // delete an expense
    void deleteExpense(UUID id);

}
