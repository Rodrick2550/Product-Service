package com.example.productsservice.infrastructure;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "products")
@Getter
@Setter
@Builder
public class ProductEntity {

    @Id
    private String id;


    @Column
    private String name;

    @Column
    private float price;

    @Column
    private Integer stock;

    public ProductEntity(String id, String name, float price, Integer stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public ProductEntity() {
    }
}
