package com.educandoweb.course.core.usecase;

import com.educandoweb.course.core.domain.OrderItem;

public interface InsertOrderItemUseCase {

    void insert(OrderItem orderItem);
}
