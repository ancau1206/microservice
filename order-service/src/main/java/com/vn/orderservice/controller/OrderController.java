package com.vn.orderservice.controller;

import com.vn.orderservice.dto.OrderRequest;
import com.vn.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String orderPlace(@RequestBody OrderRequest orderRequest) {
        orderService.placeOrder(orderRequest);       // Call to place order service
        return "Order Placed Successfully";
    }
}
