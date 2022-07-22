package com.example.user_service.controller;

import com.example.user_service.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private FeignService feignService;

    @GetMapping("/see_product/{id}")
    public ResponseEntity<Object> getProduct(@PathVariable Long id) {
        return feignService.getProduct(id);
    }

    @GetMapping("/see_all_products")
    public ResponseEntity<Object> getAllProducts() {
        return feignService.getAllProducts();
    }

}
