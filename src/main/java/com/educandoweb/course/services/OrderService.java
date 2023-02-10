package com.educandoweb.course.services;

import com.educandoweb.course.dtos.in.OrderDto;
import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.entities.enums.OrderStatusEnum;
import com.educandoweb.course.repositories.OrderRepository;
import com.educandoweb.course.repositories.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Optional;
import java.util.UUID;

@Service
public class OrderService {
    final OrderRepository orderRepository;
    final UserRepository userRepository;
    private Order order;

    public OrderService(OrderRepository orderRepository, UserRepository userRepository) {
        this.orderRepository = orderRepository;
        this.userRepository = userRepository;
    }

    public void save(UUID client, OrderDto orderDto) {
        OrderStatusEnum.validarOrderCode(orderDto.getOrderStatus());
        Order order = recuperarUser(client, orderDto);
        orderRepository.save(order);
    }

    public Page<Order> getAll(Pageable pageable) {
        return orderRepository.findAll(pageable);
    }

    public Optional<Order> findById(UUID uuid) {
      return orderRepository.findById(uuid);
    }



    private Order recuperarUser(UUID client, OrderDto orderDto) {
        try {
           Optional<User> user =  userRepository.findById(client);
            order = Order.builder()
                   .moment(Instant.now().truncatedTo(ChronoUnit.HOURS))
                    .orderStatus(orderDto.getOrderStatus())
                   .client(user.get())
                   .build();
        }catch (Exception e){
            throw new IllegalArgumentException("User não localizado: {}", e);
        }
        return  order;
    }
}
