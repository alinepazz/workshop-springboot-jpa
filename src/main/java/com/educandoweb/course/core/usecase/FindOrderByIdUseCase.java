package com.educandoweb.course.core.usecase;

import com.educandoweb.course.core.domain.Order;

import java.util.UUID;

public interface FindOrderByIdUseCase {

    Order findById(UUID id);
}
