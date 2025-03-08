package com.store.order_service.domain.ports.in;

import com.store.order_service.domain.model.Product;

import java.util.List;

public interface IProductServicePort {
    List<Product> fiendAllProduct ();
}
