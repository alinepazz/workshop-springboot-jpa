package com.educandoweb.course.core.usecase;

import com.educandoweb.course.core.domain.Order;

import java.util.UUID;

public interface InsertOrderUserCase {

    void insert (Order order, UUID user);
}
