package com.jansen.orderservice.controller;

import com.jansen.orderservice.common.Payment;
import com.jansen.orderservice.common.TransactionRequest;
import com.jansen.orderservice.common.TransactionResponse;
import com.jansen.orderservice.entity.Order;
import com.jansen.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService service;

    @PostMapping("/bookOrder")
    public TransactionResponse bookOrder(@RequestBody TransactionRequest request){
        return service.saveOrder(request);
    }
}
