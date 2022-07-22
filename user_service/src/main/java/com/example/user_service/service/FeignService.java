package com.example.user_service.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value="productService", url="http://localhost:8080/product")
public interface FeignService {

    @GetMapping("/{id}")
    ResponseEntity<Object> getProduct(@PathVariable Long id);

    @GetMapping()
    ResponseEntity<Object> getAllProducts();
}
