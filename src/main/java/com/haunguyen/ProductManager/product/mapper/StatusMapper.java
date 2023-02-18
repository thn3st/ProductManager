package com.haunguyen.ProductManager.product.mapper;

import com.haunguyen.ProductManager.product.dto.StatusDTO;
import com.haunguyen.ProductManager.product.model.Status;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StatusMapper {
    StatusMapper INSTANCE = Mappers.getMapper(StatusMapper.class);
    StatusDTO toDTO(Status model);
    Status toModel(StatusDTO dto);
}
