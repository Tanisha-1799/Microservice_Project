package com.tantech.orderservice.controller;

import com.tantech.orderservice.dto.OrderRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @PostMapping
    //This will add a new record to the order database
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        return "Order Placed Successfully!";
    }
}
