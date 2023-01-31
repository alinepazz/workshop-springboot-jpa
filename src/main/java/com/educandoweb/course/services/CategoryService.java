package com.educandoweb.course.services;

import com.educandoweb.course.dtos.in.CategoryDto;
import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class CategoryService {
    final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public void save(CategoryDto categoryDto) {
        Category category = criarCategory(categoryDto);
        categoryRepository.save(category);
    }

    public Page<Category> getAll(Pageable pageable) {
       return categoryRepository.findAll(pageable);
    }

    public Optional<Category> findById(UUID uuid) {
      return categoryRepository.findById(uuid);
    }

    private Category criarCategory(CategoryDto categoryDto) {
        Category category = Category.builder()
                .name(categoryDto.getName())
                .build();
        return category;
    }
}
