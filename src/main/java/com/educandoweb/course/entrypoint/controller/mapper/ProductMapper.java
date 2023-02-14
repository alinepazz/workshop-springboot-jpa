package com.educandoweb.course.entrypoint.controller.mapper;

import com.educandoweb.course.core.domain.Product;
import com.educandoweb.course.entrypoint.controller.request.ProductRequest;
import com.educandoweb.course.entrypoint.controller.response.ProductResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(target = "categories", ignore = true)
    Product toProduct(ProductRequest productRequest);

    List<ProductResponse> toProductResponse(List<Product> products);

    ProductResponse toProductResponseById(Product product);
}
