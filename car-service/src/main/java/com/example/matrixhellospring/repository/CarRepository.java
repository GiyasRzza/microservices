package com.example.matrixhellospring.repository;

import com.example.matrixhellospring.entity.CarDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarDao,Long> {
    CarDao findById(long id);
}
