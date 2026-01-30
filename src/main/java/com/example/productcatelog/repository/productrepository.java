package com.example.productcatelog.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.productcatelog.entity.product;

@Repository
public interface productrepository extends JpaRepository<product, Long> {

    // Custom finder
    List<product> findByCategory(String category);
}
