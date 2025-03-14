package com.store.order_service.infrastructrure.adapters;

import com.store.order_service.domain.model.Product;
import com.store.order_service.domain.model.ProductCategory;
import com.store.order_service.domain.ports.out.IProductPersistencePort;
import com.store.order_service.infrastructrure.entities.ProductEntity;
import com.store.order_service.infrastructrure.mappers.IProductEntityMapper;
import com.store.order_service.infrastructrure.repositories.IProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@RequiredArgsConstructor
public class ProductPersistenceAdapter implements IProductPersistencePort {
    private final IProductRepository productRepository;
    private final IProductEntityMapper productEntityMapper;

    public Page<Product> findFilteredProducts(Pageable pageable, ProductCategory productCategory) {

        Page<ProductEntity> productEntities = productRepository.findByProductCategory(productCategory, pageable);

        return productEntities.map(productEntityMapper::toModel);
    }
}
