package com.educandoweb.course.entrypoint.controller.mapper;

import com.educandoweb.course.core.domain.Order;
import com.educandoweb.course.entrypoint.controller.request.OrderRequest;
import com.educandoweb.course.entrypoint.controller.response.OrderResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "moment", ignore = true)
    @Mapping(target = "client", ignore = true)
    Order toOrder(OrderRequest orderRequest);

    List<OrderResponse> toOrderResponse(List<Order> orders);

    OrderResponse toOrderResponseById(Order order);
}
