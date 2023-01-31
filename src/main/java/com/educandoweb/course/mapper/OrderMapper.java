package com.educandoweb.course.mapper;

import com.educandoweb.course.dtos.out.OrderDtoOut;
import com.educandoweb.course.entities.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderDtoOut convert(Order order);
}
