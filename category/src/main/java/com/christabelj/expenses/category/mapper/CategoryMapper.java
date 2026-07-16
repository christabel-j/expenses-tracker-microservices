package com.christabelj.expenses.category.mapper;

import com.christabelj.expenses.category.domain.dto.request.CreateCategoryRequestDto;
import com.christabelj.expenses.category.domain.dto.request.UpdateCategoryRequestDto;
import com.christabelj.expenses.category.domain.dto.response.CategoryResponseDto;
import com.christabelj.expenses.category.domain.entity.Category;

public interface CategoryMapper {

    //######## request DTO to entity ########

    // create request
    Category toCategoryEntity(CreateCategoryRequestDto requestDto);

    // update request
    Category toCategoryEntity(UpdateCategoryRequestDto requestDto);

    // ########### entity to response DTO
    CategoryResponseDto toResponseDto(Category categoryEntity);
}
