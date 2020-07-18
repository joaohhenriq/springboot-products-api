package com.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.products.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	Product findById(long id);
}
