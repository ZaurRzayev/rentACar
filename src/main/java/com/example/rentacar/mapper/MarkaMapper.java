package com.example.rentacar.mapper;


import com.example.rentacar.entity.Marka;
import com.example.rentacar.entity.MarkaDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface MarkaMapper {
    MarkaDto markaToDto(Marka marka);
    List<MarkaDto> markaToDtoList(List<Marka> markas);
}
