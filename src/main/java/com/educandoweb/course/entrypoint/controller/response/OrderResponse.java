package com.educandoweb.course.entrypoint.controller.response;

import lombok.Data;

import java.time.Instant;
import java.util.UUID;

@Data
public class OrderResponse {

    private UUID id;

    private Instant moment;

    private Integer orderStatus;

    private UserResponse client;
}
