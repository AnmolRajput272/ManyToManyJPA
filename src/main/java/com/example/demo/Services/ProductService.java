package com.example.demo.Services;

import com.example.demo.Dao.ProductDao;
import com.example.demo.Entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public List<Product> getAllProducts(){
        return productDao.findAll();
    }

    public List<Product> getProductsByName(String name){
        return productDao.findByName(name);
    }

    public Product insertProduct(Product product){
        return productDao.save(product);
    }

    public List<Product> getProductsByColorid(int id){
        return productDao.findByColorsId(id);
    }

}
