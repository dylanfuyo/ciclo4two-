package com.reto2.reto2.interfaz;

import java.util.Optional;

import com.reto2.reto2.modelo.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface InterfaceUser extends MongoRepository<User, Integer>{
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
}
