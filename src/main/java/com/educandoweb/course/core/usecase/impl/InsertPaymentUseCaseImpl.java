package com.educandoweb.course.core.usecase.impl;

import com.educandoweb.course.core.dataprovider.InsertPayment;
import com.educandoweb.course.core.usecase.InsertPaymentUseCase;

import java.util.UUID;

public class InsertPaymentUseCaseImpl implements InsertPaymentUseCase {

    private final InsertPayment insertPayment;

    public InsertPaymentUseCaseImpl(InsertPayment insertPayment) {
        this.insertPayment = insertPayment;
    }

    @Override
    public void insert(UUID idOrder) {
        insertPayment.insert(idOrder);
    }
}
