package com.christabelj.expenses.expense.domain.dto.request;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public record UpdateExpenseRequestDto(
        @NotNull
        @Positive
        @Digits(integer = 10, fraction = 2)
        BigDecimal amount,

        @NotBlank
        @Size(max = 255)
        String description,

        @NotNull
        UUID categoryId,

        @NotNull
        @PastOrPresent
        LocalDate date
) {
}
