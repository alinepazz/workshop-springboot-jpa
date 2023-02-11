package com.educandoweb.course.dataprovider.repository.mapper;

import com.educandoweb.course.core.domain.Category;
import com.educandoweb.course.dataprovider.repository.entity.CategoryEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryEntityMapper {

    CategoryEntity toCategoryEntity(Category category);
}
