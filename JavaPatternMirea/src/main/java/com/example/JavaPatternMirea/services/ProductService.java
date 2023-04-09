package com.example.JavaPatternMirea.services;

import lombok.RequiredArgsConstructor;
import com.example.JavaPatternMirea.models.Product;
import org.springframework.stereotype.Service;
import com.example.JavaPatternMirea.repositories.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    public void addProduct(Product product){
        productRepository.save(product);
    }
    public Product getProduct(String name, int price){
        return productRepository.findByNameAndPrice(name,price);
    }
    public void deleteProduct(String name, int price){
        Product product = productRepository.findByNameAndPrice(name,price);
        if (product != null) productRepository.delete(product);
    }

    public void updateProduct(Product product){
        productRepository.flush();
    }
    public List<Product> showProduct(){
        return productRepository.findAll();
    }
    public boolean existsProduct(String name, int price){
        return productRepository.existsByNameAndPrice(name,price);
    }
}
