package com.educandoweb.course.entrypoint.controller;

import com.educandoweb.course.core.usecase.FindAllCategoriesUseCase;
import com.educandoweb.course.core.usecase.FindCategoryByIdUseCase;
import com.educandoweb.course.core.usecase.InsertCategoryUseCase;
import com.educandoweb.course.entrypoint.controller.mapper.CategoryMapper;
import com.educandoweb.course.entrypoint.controller.request.CategoryRequest;
import com.educandoweb.course.entrypoint.controller.response.CategoryResponse;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/api/v1/categories")
public class CategoryController {

    @Autowired
    private InsertCategoryUseCase categoryUseCase;

    @Autowired
    private FindAllCategoriesUseCase findAllCategoriesUseCase;

    @Autowired
    private FindCategoryByIdUseCase findCategoryByIdUseCase;

    @Autowired
    private CategoryMapper categoryMapper;

    @PostMapping
    public ResponseEntity<Void>insert(@Valid @RequestBody CategoryRequest categoryRequest){

        var category = categoryMapper.toCategory(categoryRequest);
        categoryUseCase.insert(category);

        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<CategoryResponse>>findAll(){
        var category = findAllCategoriesUseCase.findAll();
        var categoryResponse = categoryMapper.toCategoryResponse(category);
        return ResponseEntity.ok().body(categoryResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryResponse>findById(@PathVariable(value = "id")UUID id){
        var category = findCategoryByIdUseCase.findById(id);
        var categoryResponse = categoryMapper.toCategoryResponseById(category);
        return ResponseEntity.ok().body(categoryResponse);
    }
}
