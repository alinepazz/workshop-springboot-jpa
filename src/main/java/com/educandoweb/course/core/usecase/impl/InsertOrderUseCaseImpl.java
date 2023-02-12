package com.educandoweb.course.core.usecase.impl;

import com.educandoweb.course.core.dataprovider.InsertOrder;
import com.educandoweb.course.core.domain.Order;
import com.educandoweb.course.core.usecase.InsertOrderUserCase;

import java.util.UUID;

public class InsertOrderUseCaseImpl implements InsertOrderUserCase {

    private final InsertOrder insertOrder;

    public InsertOrderUseCaseImpl(InsertOrder insertOrder) {
        this.insertOrder = insertOrder;
    }

    @Override
    public void insert(Order order, UUID user) {
        insertOrder.insert(order, user);
    }
}
