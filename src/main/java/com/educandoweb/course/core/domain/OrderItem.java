package com.educandoweb.course.core.domain;


import com.educandoweb.course.dataprovider.repository.entity.OrderEntity;
import com.educandoweb.course.dataprovider.repository.entity.ProductEntity;
import com.educandoweb.course.dataprovider.repository.entity.pk.OrderItemEntityPK;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class OrderItem {

    private OrderItemEntityPK id = new OrderItemEntityPK();

    private Integer quantity;

    private Double price;

    public OrderItem(){}

    public OrderItem(OrderItemEntityPK id, OrderEntity order, ProductEntity product, Integer quantity, Double price) {
        id.setOrder(order);
        id.setProduct(product);
        this.quantity = quantity;
        this.price = price;
        this.id = id;
    }

    public OrderEntity getOrder(){
        return id.getOrder();
    }

    public void setOrder(OrderEntity order){
        id.setOrder(order);
    }

    public ProductEntity getProduct(){
        return id.getProduct();
    }

    public void setProduct(ProductEntity product){
        id.setProduct(product);
    }



    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public OrderItemEntityPK getId() {
        return id;
    }

    public void setId(OrderItemEntityPK id) {
        this.id = id;
    }


}
