package com.haunguyen.ProductManager.product.mapper;

import com.haunguyen.ProductManager.product.dto.SubCategoryDTO;
import com.haunguyen.ProductManager.product.model.SubCategory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper

public interface SubCategoryMapper {
    SubCategoryMapper INSTANCE = Mappers.getMapper(SubCategoryMapper.class);
    SubCategoryDTO toDTO(SubCategory model);
    SubCategory toModel(SubCategoryDTO dto);
}
