package com.educandoweb.course.core.usecase;

import com.educandoweb.course.core.domain.Product;

import java.util.UUID;

public interface InsertProductUseCase {

    void insert(Product product, UUID idCategory);
}
