package com.haunguyen.ProductManager.product.mapper;

import com.haunguyen.ProductManager.product.dto.ProductDTO;
import com.haunguyen.ProductManager.product.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper

public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    ProductDTO toDTO(Product model);
    @Mapping(source = "brands", target = "brands")
    Product toModel(ProductDTO dto);
}
