package com.educandoweb.course.controllers;

import com.educandoweb.course.dtos.CategoryDto;
import com.educandoweb.course.entities.Category;
import com.educandoweb.course.services.CategoryService;
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
@RequestMapping(value = "/categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public ResponseEntity<Object>saveUser(@RequestBody @Valid CategoryDto categoryDto ){
        categoryService.save(categoryDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(categoryDto);
    }

    @GetMapping
    public ResponseEntity<Page <Category>>getAllUsers(
            @PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.status(HttpStatus.OK).body(categoryService.getAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category>findById(@PathVariable(value = "id") UUID uuid){
        Optional<Category> category = categoryService.findById(uuid);
        return ResponseEntity.status(HttpStatus.OK).body(category.get());
    }
}
