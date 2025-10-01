package com.profwild.aulaSpring.config;

import com.profwild.aulaSpring.entities.User;
import com.profwild.aulaSpring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown","maria@gmail.com", "127873","9083498");
        User u2 = new User(null, "Alex Green","alex@gmail.com", "178773", "3294828");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
