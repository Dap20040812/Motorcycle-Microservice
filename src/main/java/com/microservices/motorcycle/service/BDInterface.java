package com.microservices.motorcycle.service;

import com.microservices.motorcycle.model.Motorcycle;

import java.util.List;

public interface BDInterface {
    List<Motorcycle> findAll();

    Motorcycle findById(int id);

    Motorcycle save(Motorcycle motorcycle);

    List<Motorcycle> findByUserId(int id);
}
