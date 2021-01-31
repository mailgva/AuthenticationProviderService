package com.gorbatenko.userproducts.repository;

import com.gorbatenko.userproducts.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository
        extends JpaRepository<Product, Integer> {
}
