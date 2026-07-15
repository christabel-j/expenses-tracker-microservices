package com.christabelj.expenses.category.domain.dto.response;

import java.util.UUID;

public record CategoryResponseDto(
        UUID id,
        String name
) {
}
