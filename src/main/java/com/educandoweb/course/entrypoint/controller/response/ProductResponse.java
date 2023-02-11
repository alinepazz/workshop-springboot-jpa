package com.educandoweb.course.entrypoint.controller.response;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class ProductResponse {

    private UUID id;

    private String name;

    private String description;

    private Double price;

    private String imgUrl;

    private List<CategoryResponse> categories ;
}
