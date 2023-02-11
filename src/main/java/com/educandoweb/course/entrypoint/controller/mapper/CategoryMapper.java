package com.educandoweb.course.entrypoint.controller.mapper;

import com.educandoweb.course.core.domain.Category;
import com.educandoweb.course.dataprovider.repository.CategoryRepository;
import com.educandoweb.course.entrypoint.controller.request.CategoryRequest;
import com.educandoweb.course.entrypoint.controller.response.CategoryResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mapping(target = "id", ignore = true)
    Category toCategory(CategoryRequest categoryRequest);

    List<CategoryResponse> toCategoryResponse(List<Category> category);

    CategoryResponse toCategoryResponseById(Category category);
}
