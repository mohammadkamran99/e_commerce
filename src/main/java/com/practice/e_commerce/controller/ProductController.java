package com.practice.e_commerce.controller;

import com.practice.e_commerce.domain.Product;
import com.practice.e_commerce.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductServiceImpl productService;

    @PostMapping("/save")
    public ResponseEntity<?> saveProduct(@RequestBody Product product) {
        System.out.println("/n ===============================save product controller============================");
        return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.OK);


    }

    @GetMapping("/productDetail/{id}")
    public ResponseEntity<?> getProductById(@PathVariable Long id) {
        return new ResponseEntity<Product>(productService.getProduct(id), HttpStatus.OK);

    }

    @GetMapping("/getAllProduct")
    public ResponseEntity<?> getAllProduct() {
        return new ResponseEntity<>(productService.getAllProduct(), HttpStatus.OK);
    }
}
