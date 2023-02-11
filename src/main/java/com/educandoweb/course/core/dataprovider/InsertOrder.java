package com.educandoweb.course.core.dataprovider;

import com.educandoweb.course.core.domain.Order;

import java.util.UUID;

public interface InsertOrder {

    void insert (Order order, UUID user);
}
