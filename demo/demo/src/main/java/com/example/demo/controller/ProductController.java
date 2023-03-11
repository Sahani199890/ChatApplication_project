package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.dao.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductRepo productRepo;
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
       return productRepo.save(product);
    }

    @GetMapping("/getProducts")
    public List<Product> getAll(){
        return productRepo.findAll();
    }
}
