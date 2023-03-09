package com.microservices.motorcycle.controller;

import com.microservices.motorcycle.controller.dto.MotorcycleDTO;
import com.microservices.motorcycle.model.Motorcycle;
import com.microservices.motorcycle.service.MotorcycleService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/motorcycle")
@AllArgsConstructor
public class MotorcycleController {

    private MotorcycleService motorcycleService;

    @GetMapping
    public ResponseEntity<List<Motorcycle>> listMotorcycles(){
        List<Motorcycle> motorcycles = motorcycleService.getAll();
        if(motorcycles.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(motorcycles);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Motorcycle> getMotorcycle(@PathVariable("id") int id){
        Motorcycle motorcycle = motorcycleService.getMotorcycleByID(id);
        if(motorcycle == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(motorcycle);
    }

    @PostMapping
    public ResponseEntity<Motorcycle> saveMotorcycle(@RequestBody MotorcycleDTO motorcycleDTO){
        Motorcycle newMotorcycle = motorcycleService.newMotorcycle(motorcycleDTO);
        return ResponseEntity.ok(newMotorcycle);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Motorcycle>> listMotorcycleByUSerId(@PathVariable("userId") int id){
        List<Motorcycle> motorcycles = motorcycleService.byUserId(id);
        if(motorcycles.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(motorcycles);
    }


}
