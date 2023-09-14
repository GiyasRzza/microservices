package com.example.product_service.service;

import com.example.product_service.dao.ProductDao;
import com.example.product_service.dto.ProductDto;
import com.example.product_service.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class ProductService {

   private final ProductRepository  productRepository;

    public ProductDao saveProduct(ProductDto productDto){
      return productRepository.save(ProductDao.builder().productName(productDto.getProductName()).
              quantity(productDto.getQuantity()).build());
    }
    public List<ProductDao> getAllProduct(){
        return productRepository.findAll();
    }

}
