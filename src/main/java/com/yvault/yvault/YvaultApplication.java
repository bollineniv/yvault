package com.yvault.yvault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableMongoRepositories("com.yvault.dto")
public class YvaultApplication {

	public static void main(String[] args) {
		SpringApplication.run(YvaultApplication.class, args);
	}


//	@Bean
//	CommandLineRunner runner(registerUserRepository userRepository){
//
//		return args -> {
//			userAddress userAddress = new userAddress(
//					"US",
//					"33617",
//					"122323,usf"
//			);
//			registerUser registerUser1 = new registerUser(
//					"Venky",
//					"Bollineni",
//					"bolineniv",
//					"test123",
//					userAddress,
//					ZonedDateTime.now()
//			);
//			userRepository.insert(registerUser1);
//		};
//	}

}
