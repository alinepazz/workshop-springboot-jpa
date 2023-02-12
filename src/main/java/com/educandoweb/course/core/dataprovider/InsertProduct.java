package com.educandoweb.course.core.dataprovider;

import com.educandoweb.course.core.domain.Product;

import java.util.UUID;

public interface InsertProduct {

    void insert(Product product, UUID idCategory);
}
