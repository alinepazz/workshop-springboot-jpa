package com.educandoweb.course.entrypoint.controller;

import com.educandoweb.course.core.usecase.*;
import com.educandoweb.course.entrypoint.controller.mapper.UserMapper;
import com.educandoweb.course.entrypoint.controller.request.UserRequest;
import com.educandoweb.course.entrypoint.controller.response.UserResponse;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/api/v1/users")
public class UserController {

    @Autowired
    private InsertUserUseCase insertUserUseCase;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private FindAllUsersUseCase findAllUsersUseCase;

    @Autowired
    private FindUserByIdUseCase findUserByIdUseCase;

    @Autowired
    private UpdateUserUseCase updateUserUseCase;

    @Autowired
    private DeleteUserUseCase deleteUserUseCase;

    @PostMapping
    public ResponseEntity<Void>insert(@Valid @RequestBody UserRequest userRequest){
        var user = userMapper.toUser(userRequest);
        insertUserUseCase.insert(user);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<UserResponse>>findAll() {
       var users = findAllUsersUseCase.findAll();
       var userResponse = userMapper.toUserResponse(users);
        return ResponseEntity.status(HttpStatus.OK).body(userResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse>findById(@PathVariable(value = "id") UUID id){
        var user = findUserByIdUseCase.findById(id);
        var userResponse = userMapper.toUserResponseById(user);

        return ResponseEntity.status(HttpStatus.OK).body(userResponse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>deleteById(@PathVariable UUID id){
        deleteUserUseCase.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void>update(@PathVariable(value = "id") UUID id, @RequestBody UserRequest userRequest){
        var user = userMapper.toUser(userRequest);
        updateUserUseCase.update(id, user);

        return ResponseEntity.ok().build();
    }
}
