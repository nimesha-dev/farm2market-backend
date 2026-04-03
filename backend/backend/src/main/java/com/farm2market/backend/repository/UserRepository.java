package com.farm2market.backend.repository;

import com.farm2market.backend.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    // This lets us find a user by email — needed for login later
    User findByEmail(String email);
}