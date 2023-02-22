package com.educandoweb.course.entrypoint.controller.mapper;

import com.educandoweb.course.core.domain.OrderItem;
import com.educandoweb.course.entrypoint.controller.request.OrderItemRequest;
import com.educandoweb.course.entrypoint.controller.response.OrderItemResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderItemMapper {


    @Mapping(target = "price", ignore = true)
    @Mapping(target = "order.id", source = "idOrder")
    @Mapping(target = "product.id", source = "idProduct")
    OrderItem toOrderItem(OrderItemRequest orderItemRequest);

    //@Mapping(target = "id.product", source = "id.product")
    List<OrderItemResponse> toOrderItemResponse(List<OrderItem> orderItems);
}
