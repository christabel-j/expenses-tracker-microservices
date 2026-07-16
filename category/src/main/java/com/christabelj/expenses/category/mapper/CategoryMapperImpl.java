package com.christabelj.expenses.category.mapper;

import com.christabelj.expenses.category.domain.dto.request.CreateCategoryRequestDto;
import com.christabelj.expenses.category.domain.dto.request.UpdateCategoryRequestDto;
import com.christabelj.expenses.category.domain.dto.response.CategoryResponseDto;
import com.christabelj.expenses.category.domain.entity.Category;

public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public Category toCategoryEntity(CreateCategoryRequestDto requestDto) {

    }

    @Override
    public Category toCategoryEntity(UpdateCategoryRequestDto requestDto) {
        return null;
    }

    @Override
    public CategoryResponseDto toResponseDto(Category categoryEntity) {
        return null;
    }
}
