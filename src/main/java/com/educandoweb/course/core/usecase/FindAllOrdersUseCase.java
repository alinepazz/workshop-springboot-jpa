package com.educandoweb.course.core.usecase;

import com.educandoweb.course.core.domain.Order;

import java.util.List;

public interface FindAllOrdersUseCase {

    List<Order> findAll();
}
