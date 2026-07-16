package com.christabelj.expenses.category.domain.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Builder
public record CategoryResponseDto(
        UUID id,
        String name
) {
}
