package com.educandoweb.course.dataprovider.repository.mapper;


import com.educandoweb.course.core.domain.Product;
import com.educandoweb.course.dataprovider.repository.entity.ProductEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductEntityMapper {

    ProductEntity toProductEntity(Product product);

    List<Product> toProduct(List<ProductEntity> productEntities);
}
