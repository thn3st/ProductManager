package com.haunguyen.ProductManager.product.service;

import com.haunguyen.ProductManager.product.dto.BrandDTO;
import com.haunguyen.ProductManager.product.mapper.BrandMapper;
import com.haunguyen.ProductManager.product.model.Brand;
import com.haunguyen.ProductManager.product.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrandServiceImpl implements BrandService{
    @Autowired
    private BrandRepository brandRepository;

    @Override
    public List<BrandDTO> findAll() {
        List<BrandDTO> brandDTOS = new ArrayList<>();
        List<Brand> brands = brandRepository.findAll();
        for (Brand brand: brands
             ) {
            brandDTOS.add(BrandMapper.INSTANCE.toDTO(brand));
        }
        return brandDTOS;
    }
}
