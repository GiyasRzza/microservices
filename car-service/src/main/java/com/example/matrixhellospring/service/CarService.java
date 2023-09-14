package com.example.matrixhellospring.service;

import com.example.matrixhellospring.repository.CarRepository;
import com.example.matrixhellospring.entity.CarDao;
import com.example.matrixhellospring.vm.CarDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CarService {

private final CarRepository carRepository;

public CarDao create (CarDto carDto) {
  CarDao carDao = new CarDao();
  carDao.setMarka(carDto.getMarka());
  carDao.setModel(carDto.getModel());
  carDao.setYear(carDto.getYear());
  carRepository.save(carDao);
  return carDao;
}
public List<CarDao> getCar(){
    return carRepository.findAll();
}
public CarDao setCar(String name, long id){
   CarDao carDao = carRepository.findById(id);
   carDao.setMarka(name);
   return carRepository.save(carDao);
}

}
