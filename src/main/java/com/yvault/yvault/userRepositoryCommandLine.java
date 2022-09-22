package com.yvault.yvault;

import com.yvault.dto.registerUser;
import com.yvault.dto.registerUserRepository;
import com.yvault.dto.userAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class userRepositoryCommandLine implements CommandLineRunner {

    @Autowired
    private registerUserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        userAddress userAddress = new userAddress(
                "US",
                "33617",
                "122323,usf"
        );
        com.yvault.dto.registerUser registerUser = new registerUser(
                "Venky",
                "Bollineni",
                "bolineniv",
                "bolinenibv@gmail.com",
                "test123",
                userAddress,
                LocalDateTime.now()
        );
        userRepository.insert(registerUser);

    }
}
