package com.educandoweb.course.dataprovider;

import com.educandoweb.course.core.dataprovider.InsertOrderItem;
import com.educandoweb.course.core.domain.Order;
import com.educandoweb.course.core.domain.OrderItem;
import com.educandoweb.course.core.domain.Product;
import com.educandoweb.course.dataprovider.repository.OrderItemRepository;
import com.educandoweb.course.dataprovider.repository.OrderRepository;
import com.educandoweb.course.dataprovider.repository.ProductRepository;
import com.educandoweb.course.dataprovider.repository.entity.OrderEntity;
import com.educandoweb.course.dataprovider.repository.entity.ProductEntity;
import com.educandoweb.course.dataprovider.repository.mapper.OrderEntityMapper;
import com.educandoweb.course.dataprovider.repository.mapper.OrderItemEntityMapper;
import com.educandoweb.course.dataprovider.repository.mapper.ProductEntityMapper;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class InsertOrderItemImpl implements InsertOrderItem {

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderRepository  orderRepository;

    @Autowired
    private OrderEntityMapper orderEntityMapper;

    @Autowired
    private ProductEntityMapper productEntityMapper;

    @Autowired
    private OrderItemEntityMapper orderItemEntityMapper;


    @Override
    public void insert(OrderItem orderItem) {
        var orderEntity = orderRepository.findById(orderItem.getOrder().getId());

        var productEntity = productRepository.findById(orderItem.getProduct().getId());

        var orderItemEntity = orderItemEntityMapper.toOrderItemEntity(orderItem);

        orderItemEntity.setOrderEntity(orderEntity.get());
        orderItemEntity.setProductEntity(productEntity.get());
        orderItemEntity.setPrice(productEntity.get().getPrice());

        orderItemRepository.save(orderItemEntity);
    }

}
