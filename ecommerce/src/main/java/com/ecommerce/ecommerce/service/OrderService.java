package com.ecommerce.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.ecommerce.entity.Order;
import com.ecommerce.ecommerce.repository.OrderRepository;

@Service
public class OrderService {


    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public Order saveOrder(Order order) {
        return repository.save(order);
    }

    public List<Order> getAllOrders() {
        return repository.findAll();
    }

    public Order getOrderById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Order updateOrder(Long id, Order order) {

        Order existingOrder = repository.findById(id).orElse(null);

        if (existingOrder != null) {

            existingOrder.setUserId(order.getUserId());
            existingOrder.setTotalAmount(order.getTotalAmount());
            existingOrder.setStatus(order.getStatus());

            return repository.save(existingOrder);
        }

        return null;
    }

    public void deleteOrder(Long id) {
        repository.deleteById(id);
    }
}
