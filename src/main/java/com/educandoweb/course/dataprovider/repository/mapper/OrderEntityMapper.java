package com.educandoweb.course.dataprovider.repository.mapper;


import com.educandoweb.course.core.domain.Order;
import com.educandoweb.course.core.domain.User;
import com.educandoweb.course.dataprovider.repository.entity.OrderEntity;
import com.educandoweb.course.dataprovider.repository.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderEntityMapper {


    OrderEntity toOrderEntity(Order order);

    List<Order> toOrder(List<OrderEntity> orderEntities);

    Order toOrderById (OrderEntity orderEntity);
}
