package com.educandoweb.course.entrypoint.controller;

import com.educandoweb.course.core.usecase.FindAllProductsUseCase;
import com.educandoweb.course.core.usecase.InsertProductUseCase;
import com.educandoweb.course.entrypoint.controller.mapper.ProductMapper;
import com.educandoweb.course.entrypoint.controller.request.ProductRequest;
import com.educandoweb.course.entrypoint.controller.response.ProductResponse;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/api/v1/products")
public class ProductController {

    @Autowired
    private InsertProductUseCase insertProductUseCase;

    @Autowired
    private FindAllProductsUseCase findAllProductsUseCase;

    @Autowired
    private ProductMapper productMapper;

    @PostMapping("/{id}")
    public ResponseEntity<Void>insert(@PathVariable(value = "id")UUID idCategory,
                                      @RequestBody ProductRequest productRequest){

        var product = productMapper.toProduct(productRequest);
        insertProductUseCase.insert(product, idCategory);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<ProductResponse>>findAll(){
        var products = findAllProductsUseCase.findAll();
        var productResponse = productMapper.toProductResponse(products);
        return ResponseEntity.ok().body(productResponse);
    }
}
