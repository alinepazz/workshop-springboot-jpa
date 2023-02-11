package com.educandoweb.course.core.usecase.impl;

import com.educandoweb.course.core.dataprovider.FindAllCategories;
import com.educandoweb.course.core.domain.Category;
import com.educandoweb.course.core.usecase.FindAllCategoriesUseCase;

import java.util.List;

public class FindAllCategoriesUseCaseImpl implements FindAllCategoriesUseCase {

    private final FindAllCategories findAllCategories;

    public FindAllCategoriesUseCaseImpl(FindAllCategories findAllCategories) {
        this.findAllCategories = findAllCategories;
    }

    @Override
    public List<Category> findAll() {
        return findAllCategories.findAll();
    }
}
