package com.example.rentacar.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MarkaDto {
    private String markaName;
    private boolean markaStatus;
//    private Set<Model> models;
}
