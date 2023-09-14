package com.example.productcacheservice.service;

import com.example.productcacheservice.dto.CarDto;
import com.example.productcacheservice.feign.product.ProductServiceFeignClient;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FeignClientService {
    private final ProductServiceFeignClient productServiceFeignClient;


}
