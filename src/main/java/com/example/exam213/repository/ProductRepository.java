package com.example.exam213.repository;

import com.example.exam213.model.Category;
import com.example.exam213.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByNameContaining(String name);

    List<Product> findAllByPriceBetween(double minPrice, double maxPrice);

    @Modifying
    @Query(value = "SELECT * FROM products ORDER BY amount DESC", nativeQuery = true)
    List<Product> sortByAmount();

    @Modifying
    @Query(value = "select * from products order by price desc limit 3 ", nativeQuery = true)
    List<Product> findTop3HighestPrice();

    List<Product> findAllByCategory_Name(String category);
}
