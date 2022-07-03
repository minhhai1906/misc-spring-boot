package com.example.demo.web;

import com.example.demo.domain.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @RequestMapping("/{userId}")
    public String displayUser(@PathVariable int userId){
        return "User Found: " + userId;
    }

    @RequestMapping("/{id}/invoices")
    public String displayUserInvoices(@PathVariable("id") int userId, @RequestParam(value = "dateOrNull",required = false) Date dateOrNull){
        return "Invoice found for user: " + userId + " on the date: " + dateOrNull;
    }

    @RequestMapping("/{userId}/items")
    public List<String> displayStringJson(@PathVariable int userId){
        return Arrays.asList("Shoes", "PS5", "Macbook");
    }

    @RequestMapping("/{userId}/products_as_json")
    public Product displayProductsJson(@PathVariable int userId){
        return new Product(1, "Shoes", 45.99);
    }
}
