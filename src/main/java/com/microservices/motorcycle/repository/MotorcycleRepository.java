package com.microservices.motorcycle.repository;

import com.microservices.motorcycle.model.Motorcycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MotorcycleRepository extends JpaRepository<Motorcycle, Integer> {

    @Query("SELECT a FROM Motorcycle a WHERE a.userId = :userId")
    List<Motorcycle> findByUserId(@Param("userId") int userId);

}
