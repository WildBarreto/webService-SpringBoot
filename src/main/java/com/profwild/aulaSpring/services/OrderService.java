package com.profwild.aulaSpring.services;

import com.profwild.aulaSpring.entities.Order;
import com.profwild.aulaSpring.entities.User;
import com.profwild.aulaSpring.repositories.OrderRepository;
import com.profwild.aulaSpring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;
    public List<Order> findAll(){
        return repository.findAll();
    }
    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }

}
