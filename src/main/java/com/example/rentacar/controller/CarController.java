package com.example.rentacar.controller;

import com.example.rentacar.entity.Car;
import com.example.rentacar.entity.CarDto;
import com.example.rentacar.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rentCar")
public class CarController {

    private final CarService carService;

    @GetMapping("/getCar")
    public List<CarDto> carGet(){
        return carService.carGet();
    }

    @GetMapping("/getCar/{carId}")
    public CarDto carGetById(@PathVariable("carId") Long carId){
        return carService.carGetById(carId);
    }

    @PostMapping("/addCar/{modelId}")
    public ResponseEntity<CarDto> carAdd(@PathVariable(value = "modelId") Long modelId,@RequestBody CarDto car) {
        return carService.addCar(modelId,car);
    }

    @PutMapping("/carUpdate/{carId}")
    public CarDto carUpdate(@PathVariable("carId") Long carId, @RequestBody Car car){
        return  carService.carUpdate(car,carId);
    }

    @DeleteMapping("/carDelete/{carId}")
    public void carDelete(@PathVariable("carId") Long carId){
        carService.carDelete(carId);
    }



}
