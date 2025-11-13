package com.profwild.aulaSpring.services;

import com.profwild.aulaSpring.entities.Category;
import com.profwild.aulaSpring.entities.User;
import com.profwild.aulaSpring.repositories.CategoryRepository;
import com.profwild.aulaSpring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;
    public List<Category> findAll(){
        return repository.findAll();
    }
    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }

}
