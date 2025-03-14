package com.store.order_service.domain.ports.out;

import com.store.order_service.domain.model.Product;
import com.store.order_service.domain.model.ProductCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface IProductPersistencePort {

    Page <Product> findFilteredProducts (Pageable page, ProductCategory productCategory);
}
