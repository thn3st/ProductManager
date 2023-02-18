package com.haunguyen.ProductManager.product.controller;

import com.haunguyen.ProductManager.common.util.ErrorHelper;
import com.haunguyen.ProductManager.common.util.ResponseHelper;
import com.haunguyen.ProductManager.product.dto.BrandDTO;
import com.haunguyen.ProductManager.product.dto.ProductDTO;
import com.haunguyen.ProductManager.product.dto.StatusDTO;
import com.haunguyen.ProductManager.product.dto.SubCategoryDTO;
import com.haunguyen.ProductManager.product.mapper.ProductMapper;
import com.haunguyen.ProductManager.product.model.Product;
import com.haunguyen.ProductManager.product.service.BrandService;
import com.haunguyen.ProductManager.product.service.ProductService;
import com.haunguyen.ProductManager.product.service.StatusService;
import com.haunguyen.ProductManager.product.service.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private BrandService brandService;
    @Autowired
    private SubCategoryService subCategoryService;

    @Autowired
    private StatusService statusService;

    @GetMapping("")
    public String products(Model model){
        List<ProductDTO> productDTOS = productService.findAll();
        List<BrandDTO> brandDTOS = brandService.findAll();
        List<SubCategoryDTO> subCategoryDTOS = subCategoryService.findAll();
        List<StatusDTO> statusDTOS = statusService.findAll();

        model.addAttribute("products", productDTOS);
        model.addAttribute("brands", brandDTOS);
        model.addAttribute("subCategories", subCategoryDTOS);
        model.addAttribute("statusList", statusDTOS);
        return "products";
    }

    @GetMapping("{id}")
    public Object findProductById(@PathVariable("id") Long id){
        Optional<ProductDTO> productDTO = productService.findById(id);
        if (productDTO.isPresent()){
            return ResponseHelper.getResponse(productDTO, HttpStatus.OK);
        } else {
           return  ResponseHelper.getErrorResponse("Product is not existed", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("")
    public String saveProduct(@Valid ProductDTO productDTO, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if (bindingResult.hasErrors()){
            redirectAttributes.addFlashAttribute("errors", bindingResult.getFieldErrors());
        } else {
            productService.save(productDTO);
            redirectAttributes.addFlashAttribute("success", "Added product successfully");
        }
        return "redirect:/products";
    }

    @PostMapping("/update/{id}")
    public String updateProduct(@PathVariable("id") Long id, @Valid ProductDTO productDTO, BindingResult bindingResult,
                                RedirectAttributes redirectAttributes){
        if (bindingResult.hasErrors()){
            redirectAttributes.addFlashAttribute("errors", bindingResult.getFieldErrors());
        } else {
            productService.update(id, productDTO);
            redirectAttributes.addFlashAttribute("success", "Edit product successfully");
        }
        return "redirect:/products";
    }
}
