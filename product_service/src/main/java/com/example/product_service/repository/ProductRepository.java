package com.example.product_service.repository;

import com.example.product_service.dao.ProductDao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<ProductDao,Long> {
    List<ProductDao> findAll();
}
