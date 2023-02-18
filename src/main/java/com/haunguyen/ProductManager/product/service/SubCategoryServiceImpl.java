package com.haunguyen.ProductManager.product.service;

import com.haunguyen.ProductManager.product.dto.SubCategoryDTO;
import com.haunguyen.ProductManager.product.mapper.SubCategoryMapper;
import com.haunguyen.ProductManager.product.model.SubCategory;
import com.haunguyen.ProductManager.product.repository.SubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubCategoryServiceImpl implements SubCategoryService{
    @Autowired
    private SubCategoryRepository subCategoryRepository;

    @Override
    public List<SubCategoryDTO> findAll() {
        List<SubCategoryDTO> subCategoryDTOS = new ArrayList<>();
        List<SubCategory> subCategories = subCategoryRepository.findAll();
        for (SubCategory subCategory: subCategories
             ) {
            subCategoryDTOS.add(SubCategoryMapper.INSTANCE.toDTO(subCategory));
        }
        return subCategoryDTOS;
    }
}
