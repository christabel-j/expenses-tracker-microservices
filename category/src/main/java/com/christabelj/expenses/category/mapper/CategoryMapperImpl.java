package com.christabelj.expenses.category.mapper;

import com.christabelj.expenses.category.domain.dto.request.CreateCategoryRequestDto;
import com.christabelj.expenses.category.domain.dto.request.UpdateCategoryRequestDto;
import com.christabelj.expenses.category.domain.dto.response.CategoryResponseDto;
import com.christabelj.expenses.category.domain.entity.Category;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public Category toCategoryEntity(CreateCategoryRequestDto requestDto) {
        return Category.builder()
                .name(requestDto.name())
                .build();
    }

    @Override
    public Category toCategoryEntity(UpdateCategoryRequestDto requestDto) {
        return Category.builder()
                .name(requestDto.name())
                .build();
    }

    @Override
    public CategoryResponseDto toResponseDto(Category categoryEntity) {
        return CategoryResponseDto.builder()
                .id(categoryEntity.getId())
                .name(categoryEntity.getName())
                .build();
    }
}
