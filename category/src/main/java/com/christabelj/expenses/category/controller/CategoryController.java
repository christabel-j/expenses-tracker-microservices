package com.christabelj.expenses.category.controller;


import com.christabelj.expenses.category.domain.dto.request.CreateCategoryRequestDto;
import com.christabelj.expenses.category.domain.dto.request.UpdateCategoryRequestDto;
import com.christabelj.expenses.category.domain.dto.response.CategoryResponseDto;
import com.christabelj.expenses.category.service.CategoryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "api/v1/categories")
public class CategoryController {
    private final CategoryService categoryService;

    // Create category
    @PostMapping
    public ResponseEntity<CategoryResponseDto> createCategory(@RequestBody @Valid CreateCategoryRequestDto requestDto){
        CategoryResponseDto responseDto = categoryService.createCategory(requestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
    }

    // List all categories
    @GetMapping
    public ResponseEntity<List<CategoryResponseDto>> getAllCategories(){
        return ResponseEntity.ok(categoryService.getAllCategories());
    }

    // Update category
    @PutMapping(path = "/{id}")
    public ResponseEntity<CategoryResponseDto> updateCategory(@PathVariable UUID id, @Valid @RequestBody UpdateCategoryRequestDto requestDto) {
        CategoryResponseDto response = categoryService.updateCategory(id, requestDto);
        return ResponseEntity.ok(response);
    }

    // Delete category
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable UUID id){
        categoryService.deleteCategory(id);

        return ResponseEntity.noContent().build();
    }
;}
