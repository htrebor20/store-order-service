package com.store.order_service.infrastructrure.controllers;

import com.store.order_service.application.dtos.responses.ProductResponseDto;
import com.store.order_service.application.mappers.IProductRequestMapper;
import com.store.order_service.domain.model.Product;
import com.store.order_service.domain.ports.in.IProductServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final IProductServicePort productServicePort;
    private final IProductRequestMapper productRequestMapper;

    @GetMapping()
    public ResponseEntity<List<ProductResponseDto>> getProduct() {
        List <Product> product = productServicePort.fiendAllProduct();
        return ResponseEntity.ok(productRequestMapper.ListToResponse(product));
    }
}
