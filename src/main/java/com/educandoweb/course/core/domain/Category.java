package com.educandoweb.course.core.domain;

import com.educandoweb.course.dataprovider.repository.entity.ProductEntity;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Category {

    private UUID id;

    private String name;

    private Set<Product> products = new HashSet<>();

    public Category(){
    }

    public Category(UUID id, String name, Set<Product> products) {
        this.id = id;
        this.name = name;
        this.products = products;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
