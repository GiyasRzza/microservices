package com.example.productcacheservice.feign.product;

import com.example.productcacheservice.dto.CarDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "car-service" ,url = "localhost:8081")
public interface ProductServiceFeignClient {

    @GetMapping("api/get")
    List<CarDto> getProduct();

}
