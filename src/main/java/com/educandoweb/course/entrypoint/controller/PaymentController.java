package com.educandoweb.course.entrypoint.controller;

import com.educandoweb.course.core.usecase.InsertPaymentUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/payments")
public class PaymentController {

    @Autowired
    private InsertPaymentUseCase insertPaymentUseCase;

    @PostMapping("/{id}")
    public ResponseEntity<Void>insert(@PathVariable(value = "id")UUID idOrder){
        insertPaymentUseCase.insert(idOrder);

       return ResponseEntity.ok().build();
    }

}
