package com.educandoweb.course.dataprovider.repository.mapper;


import com.educandoweb.course.core.domain.OrderItem;
import com.educandoweb.course.dataprovider.repository.entity.OrderItemEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderItemEntityMapper {

    OrderItemEntity toOrderItemEntity(OrderItem orderItem);
}
