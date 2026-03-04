package com.tienda.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.store.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}