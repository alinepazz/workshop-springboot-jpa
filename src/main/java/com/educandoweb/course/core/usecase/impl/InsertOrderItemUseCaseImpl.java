package com.educandoweb.course.core.usecase.impl;

import com.educandoweb.course.core.dataprovider.InsertOrderItem;
import com.educandoweb.course.core.domain.OrderItem;
import com.educandoweb.course.core.usecase.InsertOrderItemUseCase;
import org.springframework.stereotype.Component;


public class InsertOrderItemUseCaseImpl implements InsertOrderItemUseCase {

    private final InsertOrderItem insertOrderItem;

    public InsertOrderItemUseCaseImpl(InsertOrderItem insertOrderItem) {
        this.insertOrderItem = insertOrderItem;
    }

    @Override
    public void insert(OrderItem orderItem) {
        insertOrderItem.insert(orderItem);
    }
}
