package com.store.order_service.infrastructrure.controllers;

import com.store.order_service.application.dtos.responses.ProductResponseDto;
import com.store.order_service.application.mappers.IProductRequestMapper;
import com.store.order_service.domain.model.Product;
import com.store.order_service.domain.model.ProductCategory;
import com.store.order_service.domain.ports.in.IProductServicePort;
import lombok.RequiredArgsConstructor;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final IProductServicePort productServicePort;
    private final IProductRequestMapper productRequestMapper;

    @GetMapping()
    public ResponseEntity<Page<ProductResponseDto>> getProducts(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String direction,
            @RequestParam(required = false) ProductCategory productCategory,
            @RequestParam(required = false) String keyword,
            @RequestParam(required = false) BigDecimal minPrice,
            @RequestParam(required = false) BigDecimal maxPrice
    ) {
        Sort.Direction sortDirection = direction.equalsIgnoreCase("desc") ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortDirection, sortBy));
        Page<Product> productPage = productServicePort.findFilteredProducts(pageable, productCategory, keyword, sortBy, direction, minPrice, maxPrice);
        Page<ProductResponseDto> responsePage = productPage.map(productRequestMapper::toResponse);
        return ResponseEntity.ok(responsePage);
    }
}
