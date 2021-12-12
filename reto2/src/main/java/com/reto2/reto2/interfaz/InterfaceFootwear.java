package com.reto2.reto2.interfaz;

import com.reto2.reto2.modelo.Footwear;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface InterfaceFootwear extends MongoRepository<Footwear, String>{
    
}
