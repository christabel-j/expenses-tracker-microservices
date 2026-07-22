package com.christabelj.expenses.category.service;

import com.christabelj.expenses.category.domain.dto.request.CreateCategoryRequestDto;
import com.christabelj.expenses.category.domain.dto.request.UpdateCategoryRequestDto;
import com.christabelj.expenses.category.domain.dto.response.CategoryResponseDto;
import com.christabelj.expenses.category.domain.entity.Category;
import com.christabelj.expenses.category.exception.CategoryNotFoundException;
import com.christabelj.expenses.category.mapper.CategoryMapper;
import com.christabelj.expenses.category.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor

public class CategoryServiceImpl implements CategoryService {
    private CategoryMapper categoryMapper;
    private CategoryRepository categoryRepository;

    @Override
    public CategoryResponseDto createCategory(CreateCategoryRequestDto requestDto) {
        // method flow: request DTO → map to entity → database operation → map to response DTO → return
        Category category = categoryMapper.toCategoryEntity(requestDto);
        Category savedEntity = categoryRepository.save(category);
        return categoryMapper.toResponseDto(savedEntity);
    }

    @Override
    public List<CategoryResponseDto> getAllCategories() {
        // flow: Get all entities from db -> convert list to stream -> map each to response dto -> convert all back to a list
        return categoryRepository.findAll()
                .stream()
                .map(categoryMapper::toResponseDto)
                .toList();
    }

    @Override
    public CategoryResponseDto updateCategory(UUID id, UpdateCategoryRequestDto requestDto) {
        // flow: use ID to find existing entity -> change attributes to the ones in the request -> save new entity -> map to response dto
        Category categoryToUpdate = categoryRepository.findById(id)
                        .orElseThrow(()-> new CategoryNotFoundException("Error - category you want to update has not been found or doesn't exist."));

        categoryToUpdate.setName(requestDto.name());
        Category updatedCategory = categoryRepository.save(categoryToUpdate);

        return categoryMapper.toResponseDto(updatedCategory);
    }

    @Override
    public void deleteCategory(UUID id) {
        categoryRepository.deleteById(id);
    }
}
