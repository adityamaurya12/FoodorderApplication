package com.food.Foodorder;

import com.food.Foodorder.Order;
import com.food.Foodorder.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/placeOrder")
    public String placeOrder(@ModelAttribute Order order) {
        orderRepository.save(order);
        return "Order Placed Successfully!";
    }
}
