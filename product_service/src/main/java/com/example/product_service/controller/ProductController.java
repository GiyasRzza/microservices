package com.example.product_service.controller;

import com.example.product_service.dto.ProductDto;
import com.example.product_service.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api")

public class ProductController {
 @Autowired
 ProductService productService;
    @GetMapping("get-products")
    public List<ProductDto> getProduct(){
        return productService.getAllProduct().stream().
                map(ProductDto::new).collect(Collectors.toList());
    }
    @PostMapping("create")
    public ProductDto createProduct(@RequestBody ProductDto productDto){
        return new ProductDto(productService.saveProduct(productDto));
    }



}
