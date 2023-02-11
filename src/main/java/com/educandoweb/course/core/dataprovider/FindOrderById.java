package com.educandoweb.course.core.dataprovider;

import com.educandoweb.course.core.domain.Order;

import java.util.Optional;
import java.util.UUID;

public interface FindOrderById {

    Optional<Order> findById(UUID id);
}
