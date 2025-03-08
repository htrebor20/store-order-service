package com.store.order_service.application.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class ProductResponseDto {
    private Long id;

    private String name;

    private BigDecimal price;

    private int stock;

    private String category;

    private String description;
}
