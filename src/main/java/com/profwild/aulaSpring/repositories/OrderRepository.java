package com.profwild.aulaSpring.repositories;

import com.profwild.aulaSpring.entities.Order;
import com.profwild.aulaSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
