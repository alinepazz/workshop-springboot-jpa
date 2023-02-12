package com.educandoweb.course.dataprovider;

import com.educandoweb.course.core.dataprovider.FindCategoryById;
import com.educandoweb.course.core.domain.Category;
import com.educandoweb.course.dataprovider.repository.CategoryRepository;
import com.educandoweb.course.dataprovider.repository.mapper.CategoryEntityMapper;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Component
public class FindCategoryByIdImpl implements FindCategoryById {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryEntityMapper categoryEntityMapper;

    @Override
    public Optional<Category> findById(UUID id) {
        var categoryEntity = categoryRepository.findById(id);
        return categoryEntity.map(entity -> categoryEntityMapper.toCategoryById(entity));
    }
}
