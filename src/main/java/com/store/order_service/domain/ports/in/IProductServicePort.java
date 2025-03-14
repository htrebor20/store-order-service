package com.store.order_service.domain.ports.in;

import com.store.order_service.domain.model.Product;
import com.store.order_service.domain.model.ProductCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.math.BigDecimal;


public interface IProductServicePort {
    Page<Product> findFilteredProducts (Pageable pageable, ProductCategory productCategory,
                                        String keyword, String sortBy, String direction,
                                        BigDecimal minPrice, BigDecimal maxPrice);
}
