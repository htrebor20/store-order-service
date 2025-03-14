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

    private ProductCategory  productCategory;

    private String description;

    public Product(Long id, String name, BigDecimal price, int stock, ProductCategory productCategory, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.productCategory = productCategory;
        this.description = description;
    }
}


