package com.hotel.cousumer.controller;

import com.hotel.cousumer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @date 2022/5/26
 * @Author: liuzhaoshuai
 */
@RestController
public class ConsumerController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "getConsumer")
    public String getConsumer() {
        return productService.getProduct();
    }
}
