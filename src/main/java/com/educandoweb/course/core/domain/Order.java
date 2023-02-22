package com.educandoweb.course.core.domain;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class Order {

    private UUID id;

    private Instant moment;

    private Integer orderStatus;

    private User client;

    private List<OrderItem> items;

    public Order(){
    }

    public Order(UUID id, Instant moment, Integer orderStatus, User client, List<OrderItem> items) {
        this.id = id;
        this.moment = moment;
        this.orderStatus = orderStatus;
        this.client = client;
        this.items = items;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }
}
