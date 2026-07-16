package com.christabelj.expenses.category.service;

import com.christabelj.expenses.category.domain.dto.request.CreateCategoryRequestDto;
import com.christabelj.expenses.category.domain.dto.request.UpdateCategoryRequestDto;
import com.christabelj.expenses.category.domain.dto.response.CategoryResponseDto;
import com.christabelj.expenses.category.mapper.CategoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor

public class CategoryServiceImpl implements CategoryService {
    private CategoryMapper categoryMapper;

    @Override
    public CategoryResponseDto createCategory(CreateCategoryRequestDto requestDto) {
        return null;
    }

    @Override
    public List<CategoryResponseDto> getAllCategories() {
        return List.of();
    }

    @Override
    public CategoryResponseDto updateCategory(UUID id, UpdateCategoryRequestDto requestDto) {
        return null;
    }

    @Override
    public void deleteCategory(UUID id) {

    }
}
