package com.example.matrixhellospring.vm;

import com.example.matrixhellospring.entity.CarDao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarDto {
    public String marka;
    public String model;
    public String year;

    public CarDto(CarDao carDao) {
        setMarka(carDao.getMarka());
        setYear(carDao.getYear());
        setModel(carDao.getModel());
    }

}
