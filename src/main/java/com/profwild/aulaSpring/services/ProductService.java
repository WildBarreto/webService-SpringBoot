package com.profwild.aulaSpring.services;

import com.profwild.aulaSpring.entities.Product;
import com.profwild.aulaSpring.entities.User;
import com.profwild.aulaSpring.repositories.ProductRepository;
import com.profwild.aulaSpring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;
    public List<Product> findAll(){
        return repository.findAll();
    }
    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }

}
