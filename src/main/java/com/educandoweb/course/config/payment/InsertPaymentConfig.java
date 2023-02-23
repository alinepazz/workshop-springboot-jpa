package com.educandoweb.course.config.payment;

import com.educandoweb.course.core.usecase.impl.InsertPaymentUseCaseImpl;
import com.educandoweb.course.dataprovider.InsertPaymentImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertPaymentConfig {

    @Bean
    public InsertPaymentUseCaseImpl insertPaymentUseCase(InsertPaymentImpl insertPayment){

        return new InsertPaymentUseCaseImpl(insertPayment);
    }
}
