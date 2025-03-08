package com.store.order_service.domain.ports.out;

import com.store.order_service.domain.model.Product;

import java.util.List;

public interface IProductPersistencePort {
    List<Product> findAllProduct();
}
