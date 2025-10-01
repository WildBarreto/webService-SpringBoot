package com.profwild.aulaSpring.repositories;

import com.profwild.aulaSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
