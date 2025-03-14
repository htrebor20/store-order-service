package com.store.order_service.infrastructrure.repositories;

import com.store.order_service.domain.model.ProductCategory;
import com.store.order_service.infrastructrure.entities.ProductEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IProductRepository extends JpaRepository<ProductEntity,Long  > {

    @Query("SELECT p FROM ProductEntity p WHERE (:category IS NULL OR p.productCategory = :category)")
    Page<ProductEntity> findByProductCategory(@Param("category") ProductCategory category, Pageable pageable);

}
