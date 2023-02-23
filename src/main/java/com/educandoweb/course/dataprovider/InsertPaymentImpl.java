package com.educandoweb.course.dataprovider;

import com.educandoweb.course.core.dataprovider.InsertPayment;
import com.educandoweb.course.dataprovider.repository.OrderRepository;
import com.educandoweb.course.dataprovider.repository.PaymentRepository;
import com.educandoweb.course.dataprovider.repository.entity.PaymentEntity;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

@Component
public class InsertPaymentImpl implements InsertPayment {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void insert(UUID idOrder) {

        var orderEntity = orderRepository.findById(idOrder);

       var paymentEntity  = PaymentEntity.builder()
               .moment(Instant.now().truncatedTo(ChronoUnit.HOURS))
               .order(orderEntity.get())
               .build();

       orderEntity.get().setPaymentEntity(paymentEntity);

       orderRepository.save(orderEntity.get());

    }
}
