package com.educandoweb.course.dataprovider;

import com.educandoweb.course.core.dataprovider.FindAllOrderItems;
import com.educandoweb.course.core.domain.OrderItem;
import com.educandoweb.course.dataprovider.repository.OrderItemRepository;
import com.educandoweb.course.dataprovider.repository.mapper.OrderItemEntityMapper;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FindAllOrderItemsImpl implements FindAllOrderItems {

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private OrderItemEntityMapper orderItemEntityMapper;

    @Override
    public List<OrderItem> findAll() {

        var orderItemEntity = orderItemRepository.findAll();
        return orderItemEntityMapper.toOrderItem(orderItemEntity);
    }
}
