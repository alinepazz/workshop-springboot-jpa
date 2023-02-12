package com.educandoweb.course.dataprovider;

import com.educandoweb.course.core.dataprovider.InsertCategory;
import com.educandoweb.course.core.domain.Category;
import com.educandoweb.course.dataprovider.repository.CategoryRepository;
import com.educandoweb.course.dataprovider.repository.mapper.CategoryEntityMapper;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class InsertCategoryImpl implements InsertCategory {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryEntityMapper categoryEntityMapper;
    @Override
    public void insert(Category category) {
        var categoryEntity = categoryEntityMapper.toCategoryEntity(category);
        categoryRepository.save(categoryEntity);

    }
}
