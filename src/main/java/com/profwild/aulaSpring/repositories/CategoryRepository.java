package com.profwild.aulaSpring.repositories;

import com.profwild.aulaSpring.entities.Category;
import com.profwild.aulaSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
