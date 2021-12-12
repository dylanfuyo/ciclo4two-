package com.reto2.reto2.repositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import com.reto2.reto2.interfaz.InterfaceFootwear;
import com.reto2.reto2.modelo.Footwear;

@Repository
public class FootwearRepository {
    @Autowired
    private InterfaceFootwear repository;
    
    public List<Footwear> getAll() {
        return repository.findAll();
    }

    public Optional<Footwear> getClothe(String id){
        return repository.findById(id);
    }

    public Footwear create(Footwear clothe) {
        return repository.save(clothe);
    }

    public void update(Footwear clothe) {
        repository.save(clothe);
    }
    
    public void delete(Footwear clothe) {
        repository.delete(clothe);
    }
}
