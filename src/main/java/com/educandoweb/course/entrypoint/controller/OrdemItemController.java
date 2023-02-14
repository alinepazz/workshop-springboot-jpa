package com.educandoweb.course.entrypoint.controller;

import com.educandoweb.course.core.usecase.InsertOrderItemUseCase;
import com.educandoweb.course.entrypoint.controller.mapper.OrderItemMapper;
import com.educandoweb.course.entrypoint.controller.request.OrderItemRequest;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/orderItems")
public class OrdemItemController {

    @Autowired
    private InsertOrderItemUseCase orderItemUseCase;

    @Autowired
    private OrderItemMapper orderItemMapper;

    @PostMapping
    public ResponseEntity<Void>insert(@RequestBody OrderItemRequest orderItemRequest){
        var orderItem = orderItemMapper.toOrderItem(orderItemRequest);
        orderItemUseCase.insert(orderItem);
        return ResponseEntity.ok().build();
    }
}
