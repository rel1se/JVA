package com.example.JavaPatternMirea.repositories;

import com.example.JavaPatternMirea.models.Market;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarketRepository extends JpaRepository<Market, Long> {
    Market findByNameAndAddress(String name, String address);
    boolean existsBankByNameAndAddress(String name, String address);
}
