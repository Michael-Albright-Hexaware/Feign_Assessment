package com.example.product_service.controller;

import com.example.product_service.entity.Product;
import com.example.product_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable Long id) {
        return productService.getProduct(id);
    }

    @GetMapping()
    public ResponseEntity<List<Product>> getAllProducts() {
        return productService.getAllProducts();
    }
    
    @PostMapping()
    public ResponseEntity<Product> addNewProduct(@RequestBody Product product) {
        return productService.addNewProduct(product);
    }
}
