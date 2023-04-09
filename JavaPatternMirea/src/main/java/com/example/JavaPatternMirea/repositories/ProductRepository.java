package com.example.JavaPatternMirea.repositories;

import com.example.JavaPatternMirea.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByNameAndPrice(String name, int price);
    boolean existsByNameAndPrice(String name, int price);
}
