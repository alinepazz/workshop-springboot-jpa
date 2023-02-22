package com.educandoweb.course.entrypoint.controller;

import com.educandoweb.course.core.usecase.FindAllOrderItemsUseCase;
import com.educandoweb.course.core.usecase.InsertOrderItemUseCase;
import com.educandoweb.course.entrypoint.controller.mapper.OrderItemMapper;
import com.educandoweb.course.entrypoint.controller.request.OrderItemRequest;
import com.educandoweb.course.entrypoint.controller.response.OrderItemResponse;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orderItems")
public class OrdemItemController {

    @Autowired
    private InsertOrderItemUseCase orderItemUseCase;

    @Autowired
    private FindAllOrderItemsUseCase findAllOrderItemsUseCase;
    @Autowired
    private OrderItemMapper orderItemMapper;

    @PostMapping
    public ResponseEntity<Void>insert(@RequestBody OrderItemRequest orderItemRequest){
        var orderItem = orderItemMapper.toOrderItem(orderItemRequest);
        orderItemUseCase.insert(orderItem);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<OrderItemResponse>>findAll(){
        var orderItem = findAllOrderItemsUseCase.findAll();
        var orderItemsResponse = orderItemMapper.toOrderItemResponse(orderItem);

        return ResponseEntity.ok().body(orderItemsResponse);
    }
}
