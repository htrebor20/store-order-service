package com.store.order_service.infrastructrure.mappers;

import com.store.order_service.domain.model.Product;
import com.store.order_service.infrastructrure.entities.ProductEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IProductEntityMapper {
    List<Product> listToModel (List<ProductEntity> productEntityList);

}