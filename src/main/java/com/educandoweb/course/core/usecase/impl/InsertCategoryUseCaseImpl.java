package com.educandoweb.course.core.usecase.impl;

import com.educandoweb.course.core.dataprovider.InsertCategory;
import com.educandoweb.course.core.domain.Category;
import com.educandoweb.course.core.usecase.InsertCategoryUseCase;

public class InsertCategoryUseCaseImpl implements InsertCategoryUseCase {

    private final InsertCategory insertCategory;

    public InsertCategoryUseCaseImpl(InsertCategory insertCategory) {
        this.insertCategory = insertCategory;
    }

    @Override
    public void insert(Category category) {
        insertCategory.insert(category);
    }
}
