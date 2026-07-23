package com.christabelj.expenses.expense.domain.dto.response;

import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Builder
public record ExpenseResponseDto(
        UUID id,
        BigDecimal amount,
        String description,
        UUID categoryId, // soon maybe category name?
        LocalDate date
) {
}
