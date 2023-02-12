package com.educandoweb.course.entrypoint.controller.request;

import lombok.Data;

@Data
public class ProductRequest {

    private String name;

    private String description;

    private Double price;

    private String imgUrl;
}
