package com.educandoweb.course.controllers;

import com.educandoweb.course.dtos.in.OrderItemDto;
import com.educandoweb.course.entities.OrderItem;
import com.educandoweb.course.services.OrderItemService;
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
@RequestMapping(value = "/orderItems")
public class OrderItemController {

    private final OrderItemService orderItemService;

    public OrderItemController(OrderItemService orderItemService) {
        this.orderItemService = orderItemService;
    }

    @PostMapping
    public ResponseEntity<Object>saveOrderItems(@RequestBody @Valid OrderItemDto orderItemDto){
        orderItemService.save(orderItemDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(orderItemDto);
    }

    @GetMapping
    public ResponseEntity<Page <OrderItem>>getAllOrderItems(
            @PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.status(HttpStatus.OK).body(orderItemService.getAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderItem>findById(@PathVariable(value = "id") UUID uuid){
        Optional<OrderItem> orderItem = orderItemService.findById(uuid);
        return ResponseEntity.status(HttpStatus.OK).body(orderItem.get());
    }
}
