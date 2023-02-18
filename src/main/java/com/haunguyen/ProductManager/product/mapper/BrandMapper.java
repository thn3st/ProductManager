package com.haunguyen.ProductManager.product.mapper;

import com.haunguyen.ProductManager.product.dto.BrandDTO;
import com.haunguyen.ProductManager.product.model.Brand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BrandMapper {
    BrandMapper INSTANCE = Mappers.getMapper(BrandMapper.class);
    BrandDTO toDTO(Brand model);
    Brand toModel(BrandDTO dto);
}
