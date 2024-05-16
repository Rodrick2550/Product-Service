package com.example.productsservice.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.relational.core.sql.In;

@Getter
@Setter
@Builder
public class Product {

    private String id;

    private String name;

    private float price;

    private Integer stock;
}
