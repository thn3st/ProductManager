package com.haunguyen.ProductManager.product.mapper;

import com.haunguyen.ProductManager.product.dto.BrandDTO;
import com.haunguyen.ProductManager.product.model.Brand;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-15T21:58:28+0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.4.1 (Oracle Corporation)"
)
public class BrandMapperImpl implements BrandMapper {

    @Override
    public BrandDTO toDTO(Brand model) {
        if ( model == null ) {
            return null;
        }

        BrandDTO brandDTO = new BrandDTO();

        brandDTO.setId( model.getId() );
        brandDTO.setBrandName( model.getBrandName() );

        return brandDTO;
    }

    @Override
    public Brand toModel(BrandDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Brand brand = new Brand();

        brand.setId( dto.getId() );
        brand.setBrandName( dto.getBrandName() );

        return brand;
    }
}
