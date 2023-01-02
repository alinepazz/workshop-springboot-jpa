package com.educandoweb.course.controllers;

import com.educandoweb.course.dtos.UserDto;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<Object>saveUser(@RequestBody @Valid UserDto userDto ){
        userService.save(userDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(userDto);
    }

    @GetMapping
    public ResponseEntity<Page <User>>getAllUsers(
            @PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getAll(pageable));
    }
}
