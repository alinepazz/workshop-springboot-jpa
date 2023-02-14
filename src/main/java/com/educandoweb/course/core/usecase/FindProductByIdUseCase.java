package com.educandoweb.course.core.usecase;

import com.educandoweb.course.core.domain.Product;

import java.util.UUID;

public interface FindProductByIdUseCase {

    Product findById(UUID id);
}
