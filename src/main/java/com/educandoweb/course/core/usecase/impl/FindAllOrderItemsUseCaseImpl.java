package com.educandoweb.course.core.usecase.impl;

import com.educandoweb.course.core.dataprovider.FindAllOrderItems;
import com.educandoweb.course.core.domain.OrderItem;
import com.educandoweb.course.core.usecase.FindAllOrderItemsUseCase;

import java.util.List;

public class FindAllOrderItemsUseCaseImpl implements FindAllOrderItemsUseCase {

    private final FindAllOrderItems findAllOrderItems;

    public FindAllOrderItemsUseCaseImpl(FindAllOrderItems findAllOrderItems) {
        this.findAllOrderItems = findAllOrderItems;
    }

    @Override
    public List<OrderItem> findAll() {
        return findAllOrderItems.findAll();
    }
}
