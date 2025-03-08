package com.store.order_service.application.usecase;

import com.store.order_service.domain.model.Product;
import com.store.order_service.domain.ports.in.IProductServicePort;
import com.store.order_service.domain.ports.out.IProductPersistencePort;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ProductUseCase implements IProductServicePort {
private final IProductPersistencePort productPersistencePort;

    @Override
    public List<Product> fiendAllProduct() {
        return productPersistencePort.findAllProduct();
            }
}
