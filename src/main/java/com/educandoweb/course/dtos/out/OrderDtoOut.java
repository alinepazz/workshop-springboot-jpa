package com.educandoweb.course.dtos.out;

import com.educandoweb.course.entities.OrderItem;
import com.educandoweb.course.entities.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDtoOut {

    private UUID id;
    private Instant moment;
    private Integer orderStatus;
    private User client;
    private Set<OrderItem> items = new HashSet<>();
}
