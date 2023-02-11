package com.educandoweb.course.core.dataprovider;

import com.educandoweb.course.core.domain.Category;

import java.util.Optional;
import java.util.UUID;

public interface FindCategoryById {

    Optional<Category>findById(UUID id);
}
