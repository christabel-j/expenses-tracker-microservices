package com.christabelj.expenses.category.domain.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UpdateCategoryRequestDto (
        @NotBlank
        @Size(max = 100)
        String name
){
}
