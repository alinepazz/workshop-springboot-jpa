package com.educandoweb.course.core.usecase.impl;

import com.educandoweb.course.core.dataprovider.FindAllProducts;
import com.educandoweb.course.core.domain.Product;
import com.educandoweb.course.core.usecase.FindAllProductsUseCase;

import java.util.List;

public class FindAllProductsUseCaseImpl implements FindAllProductsUseCase {

    private final FindAllProducts findAllProducts;

    public FindAllProductsUseCaseImpl(FindAllProducts findAllProducts) {
        this.findAllProducts = findAllProducts;
    }

    @Override
    public List<Product> findAll() {
        return findAllProducts.findAll();
    }
}
