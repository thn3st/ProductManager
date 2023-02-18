package com.haunguyen.ProductManager.product.mapper;

import com.haunguyen.ProductManager.product.dto.SubCategoryDTO;
import com.haunguyen.ProductManager.product.model.SubCategory;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-15T21:58:28+0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.4.1 (Oracle Corporation)"
)
public class SubCategoryMapperImpl implements SubCategoryMapper {

    @Override
    public SubCategoryDTO toDTO(SubCategory model) {
        if ( model == null ) {
            return null;
        }

        SubCategoryDTO subCategoryDTO = new SubCategoryDTO();

        subCategoryDTO.setId( model.getId() );
        subCategoryDTO.setSubCateCode( model.getSubCateCode() );
        subCategoryDTO.setSubCateName( model.getSubCateName() );

        return subCategoryDTO;
    }

    @Override
    public SubCategory toModel(SubCategoryDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SubCategory subCategory = new SubCategory();

        subCategory.setId( dto.getId() );
        subCategory.setSubCateCode( dto.getSubCateCode() );
        subCategory.setSubCateName( dto.getSubCateName() );

        return subCategory;
    }
}
