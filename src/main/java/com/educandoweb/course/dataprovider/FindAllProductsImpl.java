package com.educandoweb.course.dataprovider;

import com.educandoweb.course.core.dataprovider.FindAllProducts;
import com.educandoweb.course.core.domain.Product;
import com.educandoweb.course.dataprovider.repository.ProductRepository;
import com.educandoweb.course.dataprovider.repository.mapper.ProductEntityMapper;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FindAllProductsImpl implements FindAllProducts {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductEntityMapper productEntityMapper;

    @Override
    public List<Product> findAll() {
        var productEntity = productRepository.findAll();
        return productEntityMapper.toProduct(productEntity);
    }
}
