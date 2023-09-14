package com.example.product_service.dto;

import com.example.product_service.dao.ProductDao;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data

public class ProductDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId;
    private String productName;
    private int quantity;

    public ProductDto(ProductDao productDto) {
        setProductName(productDto.getProductName());
        setQuantity(productDto.getQuantity());
    }
}
