package com.profwild.aulaSpring.repositories;

import com.profwild.aulaSpring.entities.OrderItem;
import com.profwild.aulaSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
