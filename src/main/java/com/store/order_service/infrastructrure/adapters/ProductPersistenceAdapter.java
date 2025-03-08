package com.store.order_service.infrastructrure.adapters;

import com.store.order_service.domain.model.Product;
import com.store.order_service.domain.ports.out.IProductPersistencePort;
import com.store.order_service.infrastructrure.entities.ProductEntity;
import com.store.order_service.infrastructrure.mappers.IProductEntityMapper;
import com.store.order_service.infrastructrure.repositories.IProductRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ProductPersistenceAdapter implements IProductPersistencePort {
    private final IProductRepository productRepository;
    private final IProductEntityMapper productEntityMapper;

    @Override
    public List <Product> findAllProduct() {
        List<ProductEntity> allProduct = productRepository.findAll();
        return productEntityMapper.listToModel(allProduct);
    }
}
