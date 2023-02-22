package com.educandoweb.course.dataprovider.repository.mapper;


import com.educandoweb.course.core.domain.OrderItem;
import com.educandoweb.course.dataprovider.repository.entity.OrderItemEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderItemEntityMapper {

    OrderItemEntity toOrderItemEntity(OrderItem orderItem);

    List<OrderItem> toOrderItem(List<OrderItemEntity> orderItemEntities);
}
