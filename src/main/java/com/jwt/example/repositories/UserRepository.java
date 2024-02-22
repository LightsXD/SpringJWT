package com.jwt.example.repositories;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;

import com.jwt.example.models.UserModel;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface UserRepository extends CrudRepository<UserModel, Integer> {

}
