package com.educandoweb.course.dtos.in;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDto {

    private UUID idOrder;
    private UUID idProduct;
    private Integer quantity;
}
