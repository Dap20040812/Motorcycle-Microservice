package com.microservices.motorcycle.service;

import com.microservices.motorcycle.model.Motorcycle;
import com.microservices.motorcycle.repository.MotorcycleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class BDService implements BDInterface{

    MotorcycleRepository bd;
    @Override
    public List<Motorcycle> findAll() {
        return bd.findAll();
    }

    @Override
    public Motorcycle findById(int id) {
        return bd.findById(id).orElse(null);
    }

    @Override
    public Motorcycle save(Motorcycle motorcycle) {
        return bd.save(motorcycle);
    }

    @Override
    public List<Motorcycle> findByUserId(int id) {
        return bd.findByUserId(id);
    }
}
