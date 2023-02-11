package com.educandoweb.course.config.order;

import com.educandoweb.course.core.dataprovider.InsertOrder;
import com.educandoweb.course.core.usecase.impl.InsertOrderUserCaseImpl;
import com.educandoweb.course.dataprovider.InsertOrderImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertOrderConfig {

    @Bean
    public InsertOrderUserCaseImpl insertOrderUserCase(InsertOrderImpl insertOrder){
        return new InsertOrderUserCaseImpl(insertOrder);
    }
}
