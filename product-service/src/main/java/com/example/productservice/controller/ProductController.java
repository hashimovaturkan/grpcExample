package com.example.productservice.controller;

import com.example.productservice.service.DiscountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final DiscountService discountService;

    @GetMapping
    public String getDiscount(){
        return discountService.getDiscount();
    }

}
