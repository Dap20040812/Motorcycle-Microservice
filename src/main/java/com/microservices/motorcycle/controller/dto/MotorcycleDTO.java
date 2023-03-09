package com.microservices.motorcycle.controller.dto;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class MotorcycleDTO {

    @NotNull
    private String marca;
    @NotNull
    private String model;
    @NotNull
    private int userId;
}
