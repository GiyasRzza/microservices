package com.example.matrixhellospring.controller;

import com.example.matrixhellospring.service.CarService;
import com.example.matrixhellospring.vm.CarDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("api")
public class CarController {
   private final CarService carService;
    @PostMapping( "create")
    public CarDto create(@RequestBody CarDto name){
       return new CarDto(carService.create(name));
    }
    @GetMapping("get")
    public List<CarDto> getUser(){
      return carService.getCar().stream().map(CarDto::new).toList();
    }
    @PutMapping("update")
    public CarDto setCar(@RequestHeader String name, @RequestHeader long id){
        return new CarDto(carService.setCar(name,id));
    }

}
