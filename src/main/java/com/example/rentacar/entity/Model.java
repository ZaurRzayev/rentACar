package com.example.rentacar.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_model_gen")
    @SequenceGenerator(name = "seq_model_gen", sequenceName = "seq_model_id", allocationSize = 1)
    //@Column(name = "id", nullable = false)
    private Long id;
    private String modelName;
    private boolean modelStatus;
//    @OneToOne
//    @MapsId
//    @JoinColumn(name = "car_id")
//    private Car car;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "model")
    @JsonBackReference
    private Set<Car> cars;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "marka_id")
    @JsonBackReference
    private Marka marka;

}
