package com.microservices.motorcycle.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tbl_motorCycle")
@Data
@AllArgsConstructor
@Builder
public class Motorcycle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String marca;
    private String model;
    private int userId;
}
