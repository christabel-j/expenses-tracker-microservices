package com.christabelj.expenses.expense.mapper;

import com.christabelj.expenses.expense.domain.dto.request.CreateExpenseRequestDto;
import com.christabelj.expenses.expense.domain.dto.request.UpdateExpenseRequestDto;
import com.christabelj.expenses.expense.domain.dto.response.ExpenseResponseDto;
import com.christabelj.expenses.expense.domain.entity.Expense;
import org.springframework.stereotype.Component;

@Component
public class ExpenseMapperImpl implements ExpenseMapper {
    @Override
    public Expense toEntity(CreateExpenseRequestDto requestDto) {
        return Expense.builder()
                .amount(requestDto.amount())
                .description(requestDto.description())
                .categoryId(requestDto.categoryId())
                .date(requestDto.date())
                .build();
    }

    @Override
    public Expense toEntity(UpdateExpenseRequestDto requestDto) {
         return Expense.builder()
                .amount(requestDto.amount())
                .description(requestDto.description())
                .categoryId(requestDto.categoryId())
                .date(requestDto.date())
                .build();
    }

    @Override
    public ExpenseResponseDto toResponseDto(Expense expenseEntity) {
        return ExpenseResponseDto.builder()
                .id(expenseEntity.getId())
                .amount(expenseEntity.getAmount())
                .description(expenseEntity.getDescription())
                .categoryId(expenseEntity.getCategoryId())
                .date(expenseEntity.getDate())
                .build();
    }
}
