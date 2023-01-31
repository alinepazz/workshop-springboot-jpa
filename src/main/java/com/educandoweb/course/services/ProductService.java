package com.educandoweb.course.services;

import com.educandoweb.course.dtos.in.ProductDto;
import com.educandoweb.course.entities.Category;
import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.CategoryRepository;
import com.educandoweb.course.repositories.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {
    final ProductRepository productRepository;
    final CategoryRepository categoryRepository;

    public ProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    public void save(ProductDto productDto, UUID idCategory) {
        Product product = criarProduct(productDto, idCategory);
        productRepository.save(product);
    }

    public Page<Product> getAll(Pageable pageable) {
       return productRepository.findAll(pageable);
    }

    public Optional<Product> findById(UUID uuid) {
      return productRepository.findById(uuid);
    }

    private Product criarProduct(ProductDto productDto, UUID idCategory) {
        Optional<Category> category = recuperarCategory(idCategory);
        Product product = Product.builder()
                .name(productDto.getName())
                .description(productDto.getDescription())
                .price(productDto.getPrice())
                .imgUrl(productDto.getImgUrl())
                .categories(new ArrayList<>())
                .build();
        product.getCategories().add(category.get());
        return product;
    }

    private Optional<Category> recuperarCategory(UUID idCategory) {

        try {
          Optional<Category> category = categoryRepository.findById(idCategory);
          return category;

        }catch (Exception e){
            throw new IllegalArgumentException("Category não localizada");
        }
    }

}
