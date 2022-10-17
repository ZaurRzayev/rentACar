package com.example.rentacar.mapper;


import com.example.rentacar.entity.Car;
import com.example.rentacar.entity.CarDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface CarMapper {
    CarDto carToDto(Car car);
    List<CarDto> carToDtoList(List<Car> cars);
}
