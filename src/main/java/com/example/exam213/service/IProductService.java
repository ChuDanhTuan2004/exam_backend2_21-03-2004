package com.example.exam213.service;

import com.example.exam213.model.Category;
import com.example.exam213.model.Product;
import com.example.exam213.service.IGeneralService;

import java.util.List;

public interface IProductService extends IGeneralService<Product> {
    List<Product> findAllByNameContaining(String name);

    List<Product> findAllByPriceBetween(double minPrice, double maxPrice);

    List<Product> sortByAmount();

    List<Product> findTop3HighestPrice();

    List<Product> findAllByCategory(Long id);
}
