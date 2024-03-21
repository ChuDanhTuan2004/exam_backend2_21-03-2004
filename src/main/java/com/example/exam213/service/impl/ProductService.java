package com.example.exam213.service.impl;

import com.example.exam213.model.Category;
import com.example.exam213.model.Product;
import com.example.exam213.repository.ProductRepository;
import com.example.exam213.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> findAllByNameContaining(String name) {
        return productRepository.findAllByNameContaining(name);
    }

    @Override
    public List<Product> findAllByPriceBetween(double minPrice, double maxPrice) {
        return productRepository.findAllByPriceBetween(minPrice, maxPrice);
    }

    @Override
    public List<Product> sortByAmount() {
        return productRepository.sortByAmount();
    }

    @Override
    public List<Product> findTop3HighestPrice() {
        return productRepository.findTop3HighestPrice();
    }

    @Override
    public List<Product> findAllByCategory(Category category) {
        return productRepository.findAllByCategory(category);
    }
}
