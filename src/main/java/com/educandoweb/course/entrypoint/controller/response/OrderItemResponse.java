package com.educandoweb.course.entrypoint.controller.response;

import com.educandoweb.course.core.domain.Order;
import com.educandoweb.course.core.domain.Product;
import com.educandoweb.course.core.domain.pk.OrderItemPK;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class OrderItemResponse {

    private OrderItemPK id = new OrderItemPK();


    private Integer quantity;

    private Double price;

    public OrderItemResponse(Order order, Product product, Integer quantity, Double price){
        id.setOrder(order);
        id.setProduct(product);
        this.quantity = quantity;
        this.price = price;
    }

    public OrderItemResponse(){
    }

    @JsonIgnore
    public Order getOrder(){
        return id.getOrder();
    }

    public void setOrder(Order order){
        id.setOrder(order);
    }

    public Double getSubTotal(){
        return price * quantity;
    }
    public Product getProduct(){
        return id.getProduct();
    }

    public void setProduct(Product product){
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
}
