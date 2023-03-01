package com.educandoweb.course.core.usecase.impl;

import com.educandoweb.course.core.dataprovider.FindOrderById;
import com.educandoweb.course.core.domain.Order;
import com.educandoweb.course.core.usecase.FindOrderByIdUseCase;
import com.educandoweb.course.dataprovider.exceptions.ResourceNotFoundException;

import java.util.UUID;

public class FindOrderByIdUseCaseImpl implements FindOrderByIdUseCase {

    private final FindOrderById findOrderById;

    public FindOrderByIdUseCaseImpl(FindOrderById findOrderById) {
        this.findOrderById = findOrderById;
    }

    @Override
    public Order findById(UUID id) {
        return findOrderById.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id));
    }
}
