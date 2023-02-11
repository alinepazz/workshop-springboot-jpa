package com.educandoweb.course.entrypoint.controller;

import com.educandoweb.course.core.usecase.FindAllOrdersUseCase;
import com.educandoweb.course.core.usecase.FindOrderByIdUseCase;
import com.educandoweb.course.core.usecase.InsertOrderUserCase;
import com.educandoweb.course.entrypoint.controller.mapper.OrderMapper;
import com.educandoweb.course.entrypoint.controller.request.OrderRequest;
import com.educandoweb.course.entrypoint.controller.response.OrderResponse;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/api/v1/orders")
public class OrderController {

    @Autowired
    private InsertOrderUserCase insertOrderUserCase;

    @Autowired
    private FindAllOrdersUseCase findAllOrdersUseCase;

    @Autowired
    private FindOrderByIdUseCase findOrderByIdUseCase;

    @Autowired
    private OrderMapper orderMapper;

    @PostMapping("/{id}")
    public ResponseEntity<Void>insert(@PathVariable(value = "id")
                                                  UUID user, @RequestBody OrderRequest orderRequest){
        var order = orderMapper.toOrder(orderRequest);
        insertOrderUserCase.insert(order, user);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<OrderResponse>>findAll(){
        var orders = findAllOrdersUseCase.findAll();
        var orderResponse = orderMapper.toOrderResponse(orders);
        return ResponseEntity.ok().body(orderResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderResponse>findById(@PathVariable(value = "id") UUID id){
        var order = findOrderByIdUseCase.findById(id);
        var orderResponse = orderMapper.toOrderResponseById(order);
        return ResponseEntity.ok().body(orderResponse);
    }
}
