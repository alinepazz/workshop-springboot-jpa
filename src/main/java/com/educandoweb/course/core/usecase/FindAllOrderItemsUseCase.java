package com.educandoweb.course.core.usecase;

import com.educandoweb.course.core.domain.OrderItem;

import java.util.List;

public interface FindAllOrderItemsUseCase {

    List<OrderItem>findAll();
}
