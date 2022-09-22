package com.yvault.dto;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface registerUserRepository extends MongoRepository<registerUser, String> {
}
