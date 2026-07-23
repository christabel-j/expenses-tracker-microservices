package com.christabelj.expenses.expense.mapper;

import com.christabelj.expenses.expense.domain.dto.request.CreateExpenseRequestDto;
import com.christabelj.expenses.expense.domain.dto.request.UpdateExpenseRequestDto;
import com.christabelj.expenses.expense.domain.dto.response.ExpenseResponseDto;
import com.christabelj.expenses.expense.domain.entity.Expense;

public interface ExpenseMapper {

    // Request DTO to Entity
    Expense toEntity(CreateExpenseRequestDto requestDto);

    Expense toEntity(UpdateExpenseRequestDto requestDto);

    // Entity to Response DTO
    ExpenseResponseDto toResponseDto(Expense expenseEntity);
}