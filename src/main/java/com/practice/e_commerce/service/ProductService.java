package com.practice.e_commerce.service;

import com.practice.e_commerce.domain.Product;

import java.util.List;

public interface ProductService {

    Product saveProduct(Product product);

    Product getProduct(long id);

    Product deleteProduct(long id);

    Product updateProduct(long id,Product product);

    List<Product> getAllProduct();
}
