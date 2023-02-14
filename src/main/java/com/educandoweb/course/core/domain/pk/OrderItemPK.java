package com.educandoweb.course.core.domain.pk;

import com.educandoweb.course.core.domain.Order;
import com.educandoweb.course.core.domain.Product;
import com.fasterxml.jackson.annotation.JsonIgnore;



public class OrderItemPK {

    private Order order;


    private Product product;

    @JsonIgnore
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
