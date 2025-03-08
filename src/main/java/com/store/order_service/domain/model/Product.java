package com.store.order_service.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class Product {

    private Long id;

    private String name;

    private BigDecimal price;

    private int stock;

    private String category;

    private String description;

    public Product(Long id, String name, BigDecimal price, int stock, String category, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.category = category;
        this.description = description;
    }

}
