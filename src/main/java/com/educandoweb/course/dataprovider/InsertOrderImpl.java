package com.educandoweb.course.dataprovider;

import com.educandoweb.course.core.dataprovider.InsertOrder;
import com.educandoweb.course.core.domain.Order;
import com.educandoweb.course.dataprovider.repository.OrderRepository;
import com.educandoweb.course.dataprovider.repository.UserRepository;
import com.educandoweb.course.dataprovider.repository.entity.enums.OrderStatusEnum;
import com.educandoweb.course.dataprovider.repository.mapper.OrderEntityMapper;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

@Service
public class InsertOrderImpl implements InsertOrder {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderEntityMapper orderEntityMapper;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void insert(Order order, UUID user) {
        OrderStatusEnum.validarOrderCode(order.getOrderStatus());

        var userEntity = userRepository.findById(user);

        var orderEntity = orderEntityMapper.toOrderEntity(order);

        orderEntity.setClient(userEntity.get());
        orderEntity.setMoment(Instant.now().truncatedTo(ChronoUnit.HOURS));
        orderEntity.setOrderStatus(order.getOrderStatus());

        orderRepository.save(orderEntity);
    }
}
