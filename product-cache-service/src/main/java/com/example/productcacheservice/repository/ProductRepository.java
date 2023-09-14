package com.example.productcacheservice.repository;

import com.example.productcacheservice.entity.Product;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableRedisRepositories
public interface ProductRepository extends CrudRepository<Product,Long> {

}
