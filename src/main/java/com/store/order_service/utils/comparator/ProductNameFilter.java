package com.store.order_service.utils.comparator;

import com.store.order_service.domain.model.Product;

import java.util.function.Predicate;

public class ProductNameFilter implements Predicate<Product> {
    private final String keyword;

    public ProductNameFilter(String keyword) {
        this.keyword = keyword.toLowerCase();
    }

    @Override
    public boolean test(Product product) {
        return product.getName().toLowerCase().contains(keyword);
    }
}