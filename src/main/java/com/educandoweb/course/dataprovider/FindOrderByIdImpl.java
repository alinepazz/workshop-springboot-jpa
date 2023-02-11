package com.educandoweb.course.dataprovider;

import com.educandoweb.course.core.dataprovider.FindOrderById;
import com.educandoweb.course.core.domain.Order;
import com.educandoweb.course.dataprovider.repository.OrderRepository;
import com.educandoweb.course.dataprovider.repository.mapper.OrderEntityMapper;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class FindOrderByIdImpl implements FindOrderById {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderEntityMapper orderEntityMapper;

    @Override
    public Optional<Order> findById(UUID id) {
        var orderEntity = orderRepository.findById(id);
        return orderEntity.map(entity -> orderEntityMapper.toOrderById(entity));
    }
}
