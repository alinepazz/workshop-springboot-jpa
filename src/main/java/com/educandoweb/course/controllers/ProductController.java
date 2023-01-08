package com.educandoweb.course.controllers;

import com.educandoweb.course.dtos.ProductDto;
import com.educandoweb.course.dtos.UserDto;
import com.educandoweb.course.entities.Product;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.ProductService;
import com.educandoweb.course.services.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/{id}")
    public ResponseEntity<Object>saveProduct(@PathVariable(value = "id") UUID idCategory, @RequestBody @Valid ProductDto productDto ){
        productService.save(productDto, idCategory);
        return ResponseEntity.status(HttpStatus.CREATED).body(productDto);
    }

    @GetMapping
    public ResponseEntity<Page <Product>>getAllProducts(
            @PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.status(HttpStatus.OK).body(productService.getAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product>findById(@PathVariable(value = "id") UUID uuid){
        Optional<Product> product = productService.findById(uuid);
        return ResponseEntity.status(HttpStatus.OK).body(product.get());
    }
}
