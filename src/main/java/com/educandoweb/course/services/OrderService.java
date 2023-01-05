package com.educandoweb.course.services;

import com.educandoweb.course.dtos.OrderDto;
import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.entities.enums.OrderStatus;
import com.educandoweb.course.repositories.OderRepository;
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
    final OderRepository oderRepository;
    final UserRepository userRepository;
    private Order order;

    public OrderService(OderRepository oderRepository, UserRepository userRepository) {
        this.oderRepository = oderRepository;
        this.userRepository = userRepository;
    }

    public void save(UUID client, OrderDto orderDto) {
        OrderStatus.orderStatus(orderDto.getOrderStatus());
        Order order = recuperarUser(client, orderDto);
        oderRepository.save(order);
    }

    public Page<Order> getAll(Pageable pageable) {
       return oderRepository.findAll(pageable);
    }

    public Optional<Order> findById(UUID uuid) {
      return oderRepository.findById(uuid);
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
            e.getMessage();
        }
        return  order;
    }
}
