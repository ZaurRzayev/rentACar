package com.example.rentacar.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_car_gen")
    @SequenceGenerator(name = "seq_car_gen", sequenceName = "seq_car_id", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

//    @OneToOne(mappedBy = "car", cascade = CascadeType.ALL)
//    @PrimaryKeyJoinColumn
//    private Model model;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "model_id")
    @JsonBackReference
    private Model model;

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
