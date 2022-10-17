package com.example.rentacar.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarDto {
    private  String carName;
    private Date productionYear;
    private String color;
    private double powerOfEngine;
    private String typeOfCar;
    private double engine;
    private double mile;
    private String typeOfEngine;
    private String typeOfFuel;
    private String transmitter;// oturucu
    private boolean old;
    private BigDecimal price;
    private boolean status;
}
