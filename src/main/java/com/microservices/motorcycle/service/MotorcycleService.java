package com.microservices.motorcycle.service;

import com.microservices.motorcycle.controller.dto.MotorcycleDTO;
import com.microservices.motorcycle.model.Motorcycle;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MotorcycleService {

    private BDInterface bd;

    public List<Motorcycle> getAll(){
        return bd.findAll();
    }

    public Motorcycle getMotorcycleByID(int id){
        return bd.findById(id);
    }

    public Motorcycle newMotorcycle(MotorcycleDTO motorcycleDTO){
        Motorcycle newMotorcycle = Motorcycle.builder()
                .marca(motorcycleDTO.getMarca())
                .userId(motorcycleDTO.getUserId())
                .model(motorcycleDTO.getModel())
                .build();
        return bd.save(newMotorcycle);
    }

    public List<Motorcycle> byUserId(int userId) {
        return bd.findByUserId(userId);
    }


}
