package com.educandoweb.course.dataprovider;

import com.educandoweb.course.core.dataprovider.InsertProduct;
import com.educandoweb.course.core.domain.Product;
import com.educandoweb.course.dataprovider.repository.CategoryRepository;
import com.educandoweb.course.dataprovider.repository.ProductRepository;
import com.educandoweb.course.dataprovider.repository.mapper.ProductEntityMapper;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Component
public class InsertProductImpl implements InsertProduct {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductEntityMapper productEntityMapper;

    @Override
    public void insert(Product product, UUID idCategory) {

        var categoryEntity = categoryRepository.findById(idCategory);

        var productEntity = productEntityMapper.toProductEntity(product);
        productEntity.setCategories(new ArrayList<>());
        productEntity.getCategories().add(categoryEntity.get());

        productRepository.save(productEntity);
    }
}
