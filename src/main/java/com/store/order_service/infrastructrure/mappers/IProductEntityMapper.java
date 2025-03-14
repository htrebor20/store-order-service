package com.store.order_service.infrastructrure.mappers;

import com.store.order_service.domain.model.Product;
import com.store.order_service.infrastructrure.entities.ProductEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IProductEntityMapper {
   Product toModel (ProductEntity productEntity);

}