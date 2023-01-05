package com.educandoweb.course.controllers;

import com.educandoweb.course.dtos.OrderDto;
import com.educandoweb.course.dtos.UserDto;
import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.OrderService;
import com.educandoweb.course.services.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/{id}")
    public ResponseEntity<Object>saveUser(@PathVariable(value = "id") UUID client, @RequestBody  OrderDto orderDto){
        orderService.save(client, orderDto);
        return ResponseEntity.status(HttpStatus.CREATED).body("Pedido cadastrado com sucesso!");
    }

    @GetMapping
    public ResponseEntity<Page <Order>>getAllUsers(
            @PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.status(HttpStatus.OK).body(orderService.getAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order>findById(@PathVariable(value = "id") UUID uuid){
        Optional<Order> order = orderService.findById(uuid);
        return ResponseEntity.status(HttpStatus.OK).body(order.get());
    }
}
