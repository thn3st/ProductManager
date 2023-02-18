package com.haunguyen.ProductManager.product.service;

import com.haunguyen.ProductManager.product.dto.StatusDTO;
import com.haunguyen.ProductManager.product.mapper.StatusMapper;
import com.haunguyen.ProductManager.product.model.Status;
import com.haunguyen.ProductManager.product.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StatusServiceImpl implements StatusService{
    @Autowired
    private StatusRepository statusRepository;
    @Override
    public List<StatusDTO> findAll() {
        List<StatusDTO> statusDTOS = new ArrayList<>();
        List<Status> statusList = statusRepository.findAll();
        for (Status status:
             statusList) {
            statusDTOS.add(StatusMapper.INSTANCE.toDTO(status));
        }
        return statusDTOS;
    }
}
