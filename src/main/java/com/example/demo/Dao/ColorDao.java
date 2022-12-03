package com.example.demo.Dao;

import com.example.demo.Entities.Color;
import com.example.demo.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ColorDao extends JpaRepository<Color,Integer> {

    public List<Color> findByColorname(String colorname);

}
