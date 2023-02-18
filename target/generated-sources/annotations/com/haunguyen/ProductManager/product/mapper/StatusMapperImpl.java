package com.haunguyen.ProductManager.product.mapper;

import com.haunguyen.ProductManager.product.dto.StatusDTO;
import com.haunguyen.ProductManager.product.model.Status;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-15T21:58:28+0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.4.1 (Oracle Corporation)"
)
public class StatusMapperImpl implements StatusMapper {

    @Override
    public StatusDTO toDTO(Status model) {
        if ( model == null ) {
            return null;
        }

        StatusDTO statusDTO = new StatusDTO();

        statusDTO.setId( model.getId() );
        statusDTO.setStatusName( model.getStatusName() );

        return statusDTO;
    }

    @Override
    public Status toModel(StatusDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Status status = new Status();

        status.setId( dto.getId() );
        status.setStatusName( dto.getStatusName() );

        return status;
    }
}
