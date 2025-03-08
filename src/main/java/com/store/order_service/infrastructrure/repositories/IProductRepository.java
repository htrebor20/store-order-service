package com.store.order_service.infrastructrure.repositories;

import com.store.order_service.infrastructrure.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<ProductEntity,Long  > {
}
