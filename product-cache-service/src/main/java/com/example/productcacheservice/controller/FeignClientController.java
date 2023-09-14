package com.example.productcacheservice.controller;

import com.example.productcacheservice.dto.CarDto;
import com.example.productcacheservice.feign.product.ProductServiceFeignClient;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class FeignClientController {
   private  final   ProductServiceFeignClient productServiceFeignClient;

    @GetMapping("get")
    public List<CarDto> feignClientGet(){
        System.out.println(productServiceFeignClient.getProduct());
        return   productServiceFeignClient.getProduct();
    }
}
