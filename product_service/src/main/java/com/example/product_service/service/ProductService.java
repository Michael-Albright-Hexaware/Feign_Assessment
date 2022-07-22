package com.example.product_service.service;

import com.example.product_service.entity.Product;
import com.example.product_service.serviceImpl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ProductService {

    public ResponseEntity<Product> addNewProduct(@RequestBody Product product);

    ResponseEntity<Product> getProduct(@PathVariable Long id);

    ResponseEntity<List<Product>> getAllProducts();

}
