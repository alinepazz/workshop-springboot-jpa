package com.educandoweb.course.core.usecase;

import com.educandoweb.course.core.domain.Category;

import java.util.List;

public interface FindAllCategoriesUseCase {

    List<Category> findAll();
}
