package com.educandoweb.course.entrypoint.controller.response;

import com.educandoweb.course.core.domain.OrderItem;
import com.educandoweb.course.dataprovider.repository.entity.PaymentEntity;
import lombok.Data;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Data
public class OrderResponse {

    private UUID id;

    private Instant moment;

    private Integer orderStatus;

    private UserResponse client;

    private List<OrderItemResponse> items;

    private PaymentEntity paymentEntity;


    public Double getTotal(){
        double sum = 0.0;
        for (OrderItemResponse orderItem: items){
            sum += orderItem.getSubTotal();
        }
        return sum;
    }
}
