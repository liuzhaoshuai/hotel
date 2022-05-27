package com.hotel.product.controller;

import com.hotel.entity.entity.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @date 2022/5/25
 * @Author: liuzhaoshuai
 */
@RestController
public class ProductController {

    @RequestMapping(value = "getProduct")
    public String getProduct() {
        Product product = new Product();
        return product.toString();
    }
}
