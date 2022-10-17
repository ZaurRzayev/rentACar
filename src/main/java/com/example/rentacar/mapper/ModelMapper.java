package com.example.rentacar.mapper;


import com.example.rentacar.entity.Model;
import com.example.rentacar.entity.ModelDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ModelMapper {
    ModelDto modelToDto(Model model);
    List<ModelDto> modelToDtoList(List<Model> models);
}