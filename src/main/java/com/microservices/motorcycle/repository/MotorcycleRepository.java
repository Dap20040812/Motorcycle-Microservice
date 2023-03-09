package com.microservices.motorcycle.repository;

import com.microservices.motorcycle.model.Motorcycle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MotorcycleRepository extends JpaRepository<Motorcycle, Integer> {
    List<Motorcycle> findByUserId(int userId);

}
