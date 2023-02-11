package com.educandoweb.course.core.usecase;

import com.educandoweb.course.core.domain.Category;

import java.util.UUID;

public interface FindCategoryByIdUseCase {

    Category findById(UUID id);
}
