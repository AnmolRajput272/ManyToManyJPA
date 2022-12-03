package com.example.demo.Controllers;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.demo.Entities.Product;
import com.example.demo.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/products/{name}")
    public List<Product> getByName(@PathVariable(name = "name") String name){
        return productService.getProductsByName(name);
    }

    @PostMapping("/product")
    public Product insertProduct(@RequestBody Product product){
        return productService.insertProduct(product);
    }

    @GetMapping("/products_by_color/{color}")
    public List<Product> getProductByColor(@PathVariable(name = "color") int color_id){
        System.out.println(color_id);
        return productService.getProductsByColorid(color_id);
    }

}
