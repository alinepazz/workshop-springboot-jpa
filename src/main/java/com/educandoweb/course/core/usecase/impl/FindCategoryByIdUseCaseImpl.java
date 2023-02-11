package com.educandoweb.course.core.usecase.impl;

import com.educandoweb.course.core.dataprovider.FindCategoryById;
import com.educandoweb.course.core.domain.Category;
import com.educandoweb.course.core.usecase.FindCategoryByIdUseCase;

import java.util.UUID;

public class FindCategoryByIdUseCaseImpl implements FindCategoryByIdUseCase {

    private final FindCategoryById findCategoryById;

    public FindCategoryByIdUseCaseImpl(FindCategoryById findCategoryById) {
        this.findCategoryById = findCategoryById;
    }

    @Override
    public Category findById(UUID id) {
        return findCategoryById.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found!"));
    }
}
