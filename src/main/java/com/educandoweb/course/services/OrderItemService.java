package com.educandoweb.course.services;

import com.educandoweb.course.dtos.in.OrderItemDto;
import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.OrderItem;
import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.OrderItemRepository;
import com.educandoweb.course.repositories.OrderRepository;
import com.educandoweb.course.repositories.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class OrderItemService {
    final OrderItemRepository orderItemRepository;
    final OrderRepository orderRepository;
    final ProductRepository productRepository;

    public OrderItemService(OrderItemRepository orderItemRepository, OrderRepository orderRepository, ProductRepository productRepository) {
        this.orderItemRepository = orderItemRepository;
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
    }

    public void save(OrderItemDto orderItemDto) {
        Optional<Order> order = recuperarOrder(orderItemDto.getIdOrder());
        Optional<Product> product= recuperarProduct(orderItemDto.getIdProduct());
        OrderItem orderItem = criarOrderItem(order, product, orderItemDto);
        orderItemRepository.save(orderItem);
    }



    public Page<OrderItem> getAll(Pageable pageable) {
       return orderItemRepository.findAll(pageable);
    }

    public Optional<OrderItem> findById(UUID uuid) {
      return orderItemRepository.findById(uuid);
    }


    private Optional<Order> recuperarOrder(UUID idOrder) {
       return orderRepository.findById(idOrder);
    }

    private Optional<Product> recuperarProduct(UUID idProduct) {
        return productRepository.findById(idProduct);
    }


    private OrderItem criarOrderItem(Optional<Order> order, Optional<Product> product, OrderItemDto orderItemDto) {
        OrderItem orderItem = new OrderItem(order.get(),product.get(), orderItemDto.getQuantity(),product.get().getPrice());
        return orderItem;
    }
}
