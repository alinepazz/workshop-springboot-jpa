package com.educandoweb.course.dataprovider;

import com.educandoweb.course.core.dataprovider.FindAllOrders;
import com.educandoweb.course.core.domain.Order;
import com.educandoweb.course.dataprovider.repository.OrderRepository;
import com.educandoweb.course.dataprovider.repository.mapper.OrderEntityMapper;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindAllOrdersImpl implements FindAllOrders {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderEntityMapper orderEntityMapper;

    @Override
    public List<Order> findAll() {

        var orderEntity = orderRepository.findAll();

        return orderEntityMapper.toOrder(orderEntity);
    }
}
