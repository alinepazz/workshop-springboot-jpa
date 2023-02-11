package com.educandoweb.course.dataprovider.repository.entity.enums;

public enum OrderStatusEnum {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private Integer code;

    OrderStatusEnum(Integer code) {
        this.code = code;
    }

    public Integer getCode(){
        return code;
    }

    public static OrderStatusEnum validarOrderCode(Integer code){
        for (OrderStatusEnum value : OrderStatusEnum.values()){
            if (value.getCode() == code){
                return value;
            }
        }
        throw  new IllegalArgumentException("Invalid OrderStatus code");
    }
}