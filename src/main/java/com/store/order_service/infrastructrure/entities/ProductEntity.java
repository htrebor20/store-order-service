package com.store.order_service.infrastructrure.entities;

import com.store.order_service.domain.model.ProductCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "product")
public class ProductEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private BigDecimal price;

    private int stock;

    @Enumerated(EnumType.STRING)
    @Column(name = "category")
    private ProductCategory productCategory;

    private String description;

}
