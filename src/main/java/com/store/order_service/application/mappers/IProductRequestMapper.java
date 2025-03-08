package com.store.order_service.application.mappers;

import com.store.order_service.application.dtos.responses.ProductResponseDto;
import com.store.order_service.domain.model.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IProductRequestMapper {
ProductResponseDto toResponse (Product product);
List <ProductResponseDto> ListToResponse (List<Product> products);
}
