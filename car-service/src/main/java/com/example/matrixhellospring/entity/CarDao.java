package com.example.matrixhellospring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class CarDao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String marka;
    public String model;
    public String year;

}
