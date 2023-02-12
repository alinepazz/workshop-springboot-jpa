package com.educandoweb.course.core.usecase.impl;

import com.educandoweb.course.core.dataprovider.InsertProduct;
import com.educandoweb.course.core.domain.Product;
import com.educandoweb.course.core.usecase.InsertProductUseCase;

import java.util.UUID;

public class InsertProductUseCaseImpl implements InsertProductUseCase {

    private final InsertProduct insertProduct;

    public InsertProductUseCaseImpl(InsertProduct insertProduct) {
        this.insertProduct = insertProduct;
    }

    @Override
    public void insert(Product product, UUID idCategory) {
        insertProduct.insert(product, idCategory);
    }
}
