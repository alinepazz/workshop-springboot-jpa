package com.educandoweb.course.core.usecase.impl;

import com.educandoweb.course.core.dataprovider.FindProductById;
import com.educandoweb.course.core.domain.Product;
import com.educandoweb.course.core.usecase.FindProductByIdUseCase;
import com.educandoweb.course.dataprovider.exceptions.ResourceNotFoundException;

import java.util.UUID;

public class FindProductByIdUseCaseImpl implements FindProductByIdUseCase {

    private final FindProductById findProductById;

    public FindProductByIdUseCaseImpl(FindProductById findProductById) {
        this.findProductById = findProductById;
    }

    @Override
    public Product findById(UUID id) {
        return findProductById.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id));
    }
}
