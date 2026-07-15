package com.christabelj.expenses.category.service;

import com.christabelj.expenses.category.domain.dto.request.CreateCategoryRequestDto;
import com.christabelj.expenses.category.domain.dto.request.UpdateCategoryRequestDto;
import com.christabelj.expenses.category.domain.dto.response.CategoryResponseDto;

import java.util.List;
import java.util.UUID;

public interface CategoryService {

    // create category
    CategoryResponseDto createCategory(CreateCategoryRequestDto requestDto);

    // list all categories
    List<CategoryResponseDto> getAllCategories();

    // update a category
    CategoryResponseDto updateCategory(UUID id, UpdateCategoryRequestDto requestDto);

    // delete a category
    void deleteCategory(UUID id);

}
