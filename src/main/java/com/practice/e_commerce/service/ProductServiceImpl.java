package com.practice.e_commerce.service;

import com.practice.e_commerce.domain.Product;
import com.practice.e_commerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;


    @Override
    public Product saveProduct(Product product) {
        System.out.println("/n ********save product Service***********");

        if (productRepository.findById(product.getId()).isPresent()) {
            throw new RuntimeException("User already Exists");
        }
        return productRepository.save(product);
    }

    @Override
    public Product getProduct(long id) {
        System.out.println("*********inside get product service********");

        return productRepository.findById(id).get();
    }

    @Override
    public Product deleteProduct(long id) {
        return null;
    }

    @Override
    public Product updateProduct(long id) {
        return null;
    }

    @Override
    public List<Product> getAllProduct() {
        return null;
    }
}
