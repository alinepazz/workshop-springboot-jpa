package com.educandoweb.course.entrypoint.controller.request;

import lombok.Data;

import java.util.UUID;

@Data
public class OrderItemRequest {

    private UUID idOrder;
    private UUID idProduct;
    private Integer quantity;
}
