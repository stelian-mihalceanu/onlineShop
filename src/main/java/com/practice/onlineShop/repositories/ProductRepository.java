package com.practice.onlineShop.repositories;

import com.practice.onlineShop.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
