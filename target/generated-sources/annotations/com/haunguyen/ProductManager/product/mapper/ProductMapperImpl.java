package com.haunguyen.ProductManager.product.mapper;

import com.haunguyen.ProductManager.product.dto.ProductDTO;
import com.haunguyen.ProductManager.product.model.Brand;
import com.haunguyen.ProductManager.product.model.Product;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-15T22:11:09+0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.4.1 (Oracle Corporation)"
)
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDTO toDTO(Product model) {
        if ( model == null ) {
            return null;
        }

        ProductDTO productDTO = new ProductDTO();

        productDTO.setId( model.getId() );
        productDTO.setProductName( model.getProductName() );
        productDTO.setColor( model.getColor() );
        productDTO.setQuantity( model.getQuantity() );
        productDTO.setSellPrice( model.getSellPrice() );
        Set<Brand> set = model.getBrands();
        if ( set != null ) {
            productDTO.setBrands( new HashSet<Brand>( set ) );
        }
        productDTO.setSubCate( model.getSubCate() );
        productDTO.setOriginPrice( model.getOriginPrice() );
        productDTO.setStatus( model.getStatus() );

        return productDTO;
    }

    @Override
    public Product toModel(ProductDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Product product = new Product();

        Set<Brand> set = dto.getBrands();
        if ( set != null ) {
            product.setBrands( new HashSet<Brand>( set ) );
        }
        product.setId( dto.getId() );
        product.setProductName( dto.getProductName() );
        product.setColor( dto.getColor() );
        product.setQuantity( dto.getQuantity() );
        product.setSellPrice( dto.getSellPrice() );
        product.setOriginPrice( dto.getOriginPrice() );
        product.setSubCate( dto.getSubCate() );
        product.setStatus( dto.getStatus() );

        return product;
    }
}
