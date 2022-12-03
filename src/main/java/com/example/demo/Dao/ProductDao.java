package com.example.demo.Dao;

import com.example.demo.Entities.Color;
import com.example.demo.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDao extends JpaRepository<Product,Integer> {

    public List<Product> findByName(String name);
    public List<Product> findByColorsId(int id);

}
