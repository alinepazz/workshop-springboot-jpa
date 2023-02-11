package com.educandoweb.course.dataprovider.repository.mapper;

import com.educandoweb.course.core.domain.Category;
import com.educandoweb.course.dataprovider.repository.entity.CategoryEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryEntityMapper {

    CategoryEntity toCategoryEntity(Category category);

    List<Category> toCategory(List<CategoryEntity> categoryEntity);

    Category toCategoryById(CategoryEntity categoryEntity);
}
