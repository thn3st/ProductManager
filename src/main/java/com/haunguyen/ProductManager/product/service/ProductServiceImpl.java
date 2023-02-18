package com.haunguyen.ProductManager.product.service;

import com.haunguyen.ProductManager.product.dto.ProductDTO;
import com.haunguyen.ProductManager.product.mapper.ProductMapper;
import com.haunguyen.ProductManager.product.model.Brand;
import com.haunguyen.ProductManager.product.model.Product;
import com.haunguyen.ProductManager.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductDTO> findAll() {
        List<ProductDTO> productDTOS = new ArrayList<>();
        List<Product> products = productRepository.findAll();
        for (Product product : products) {
            productDTOS.add(ProductMapper.INSTANCE.toDTO(product));
        }
        return productDTOS;
    }

    @Override
    public ProductDTO save(ProductDTO productDTO) {
        Product product = ProductMapper.INSTANCE.toModel(productDTO);
        for (Brand brand: productDTO.getBrands()) {
            product.addBrand(brand);
        }
        productRepository.save(product);
        return ProductMapper.INSTANCE.toDTO(product);
    }

    @Override
    public ProductDTO update(Long id, ProductDTO productDTO) {
        Optional<Product> productOtp = productRepository.findById(id);
        if (productOtp.isEmpty()) {
            return null;
        }
        Product product = productOtp.get();
        product.setProductName(productDTO.getProductName());
        product.setColor(productDTO.getColor());
        product.setQuantity(productDTO.getQuantity());
        product.setSellPrice(productDTO.getSellPrice());
        product.setOriginPrice(productDTO.getOriginPrice());
        if (!(product.getBrands().equals(productDTO.getBrands()))){
            for (Brand brand: product.getBrands()) {
                product.removeBrand(brand);
            }
            for (Brand brand: productDTO.getBrands()) {
                product.addBrand(brand);
            }
        }
        product.setSubCate(productDTO.getSubCate());
        product.setStatus(productDTO.getStatus());
        productRepository.save(product);
        return ProductMapper.INSTANCE.toDTO(product);
    }

    @Override
    public Optional<ProductDTO> findById(Long id) {
        return productRepository.findById(id).map(ProductMapper.INSTANCE::toDTO);
    }
}
