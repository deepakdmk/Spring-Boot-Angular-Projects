package com.deeps.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deeps.ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
