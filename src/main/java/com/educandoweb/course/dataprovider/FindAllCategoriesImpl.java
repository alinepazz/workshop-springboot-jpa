package com.educandoweb.course.dataprovider;

import com.educandoweb.course.core.dataprovider.FindAllCategories;
import com.educandoweb.course.core.domain.Category;
import com.educandoweb.course.dataprovider.repository.CategoryRepository;
import com.educandoweb.course.dataprovider.repository.mapper.CategoryEntityMapper;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class FindAllCategoriesImpl implements FindAllCategories {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryEntityMapper categoryEntityMapper;

    @Override
    public List<Category> findAll() {
        var categoryEntity = categoryRepository.findAll();
        return categoryEntityMapper.toCategory(categoryEntity);
    }
}
