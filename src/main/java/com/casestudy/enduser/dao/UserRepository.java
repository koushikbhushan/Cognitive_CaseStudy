package com.casestudy.enduser.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.enduser.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
