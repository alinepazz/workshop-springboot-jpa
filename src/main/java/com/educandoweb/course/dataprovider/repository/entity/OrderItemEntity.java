package com.educandoweb.course.dataprovider.repository.entity;


import com.educandoweb.course.dataprovider.repository.entity.pk.OrderItemEntityPK;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TB_ORDER_ITEM")
public class    OrderItemEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private OrderItemEntityPK id = new OrderItemEntityPK();

    @Column
    private Integer quantity;

    @Column
    private Double price;


    public OrderItemEntity(){
    }

    public OrderItemEntity(OrderEntity order, ProductEntity product, Integer quantity, Double price){
        id.setOrder(order);
        id.setProduct(product);
        this.quantity = quantity;
        this.price = price;
    }


    @JsonIgnore
    public OrderEntity getOrderEntity(){
        return id.getOrder();
    }

    public void setOrderEntity(OrderEntity order){
        id.setOrder(order);
    }

    @JsonIgnore
    public ProductEntity getProductEntity(){
        return id.getProduct();
    }

    public void setProductEntity(ProductEntity product){
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

