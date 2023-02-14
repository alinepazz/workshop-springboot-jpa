package com.educandoweb.course.dataprovider;

import com.educandoweb.course.core.dataprovider.FindProductById;
import com.educandoweb.course.core.domain.Product;
import com.educandoweb.course.dataprovider.repository.ProductRepository;
import com.educandoweb.course.dataprovider.repository.mapper.ProductEntityMapper;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
public class FindProductByIdImpl implements FindProductById {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductEntityMapper productEntityMapper;

    @Override
    public Optional<Product> findById(UUID id) {
        var productEntity = productRepository.findById(id);
        return productEntity.map(entity -> productEntityMapper.toProductById(entity));
    }
}
