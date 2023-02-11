package com.educandoweb.course.core.usecase.impl;

import com.educandoweb.course.core.dataprovider.FindAllOrders;
import com.educandoweb.course.core.domain.Order;
import com.educandoweb.course.core.usecase.FindAllOrdersUseCase;

import java.util.List;

public class FindAllOrdersUseCaseImpl implements FindAllOrdersUseCase {

    private final FindAllOrders findAllOrders;

    public FindAllOrdersUseCaseImpl(FindAllOrders findAllOrders) {
        this.findAllOrders = findAllOrders;
    }

    @Override
    public List<Order> findAll() {
        return findAllOrders.findAll();
    }
}
