package com.christabelj.expenses.category.domain.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;

@Builder
public record CreateCategoryRequestDto (
        @NotBlank
        @Size(max = 100)
        String name
){
}
