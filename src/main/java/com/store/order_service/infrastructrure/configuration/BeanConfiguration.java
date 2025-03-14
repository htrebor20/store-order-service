package com.store.order_service.infrastructrure.configuration;

import com.store.order_service.application.usecase.ProductUseCase;
import com.store.order_service.domain.ports.in.IProductServicePort;
import com.store.order_service.domain.ports.out.IProductPersistencePort;
import com.store.order_service.infrastructrure.adapters.ProductPersistenceAdapter;
import com.store.order_service.infrastructrure.mappers.IProductEntityMapper;
import com.store.order_service.infrastructrure.repositories.IProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final IProductEntityMapper productEntityMapper;
    private final IProductRepository  productRepository;

    @Bean
    public IProductPersistencePort productPersistencePort() {
        return new ProductPersistenceAdapter(productRepository, productEntityMapper) ;
    }

    @Bean
    public IProductServicePort restaurantServicePort() {
        return new ProductUseCase(productPersistencePort())  ;
    }
}
