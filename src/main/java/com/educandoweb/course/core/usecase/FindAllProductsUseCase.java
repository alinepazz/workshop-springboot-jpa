package com.educandoweb.course.core.usecase;

import com.educandoweb.course.core.domain.Product;

import java.util.List;

public interface FindAllProductsUseCase {

    List<Product> findAll();
}
