package com.example.rentacar.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table
@AllArgsConstructor
@RequiredArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Marka {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_marka_gen")
    @SequenceGenerator(name = "seq_marka_gen", sequenceName = "seq_marka_id", allocationSize = 1)
    //@Column(name = "id", nullable = false)
    private Long id;
    private String markaName;
    private boolean markaStatus;


    @OneToMany(mappedBy = "marka",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonBackReference
    private Set<Model> models;

//    private List<Model> models;
    @Override
    public String toString() {
        return "Marka [id=" + id + ", Marka Name=" + markaName + "]";
    }
}
