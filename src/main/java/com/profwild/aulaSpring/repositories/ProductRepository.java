package com.profwild.aulaSpring.repositories;

import com.profwild.aulaSpring.entities.Category;
import com.profwild.aulaSpring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
