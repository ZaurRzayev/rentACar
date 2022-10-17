package com.example.rentacar.service;

import com.example.rentacar.entity.Car;
import com.example.rentacar.entity.CarDto;
import com.example.rentacar.entity.Model;
import com.example.rentacar.mapper.CarMapper;
import com.example.rentacar.repository.CarRepository;
import com.example.rentacar.repository.ModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {
    private final ModelRepository modelRepository;
    private final CarRepository carRepository;
    private final CarMapper carMapper;

    public List<CarDto> carGet(){

        List<Car> cars = carRepository.findAll();

        return carMapper.carToDtoList(cars);
    }

    public CarDto carGetById(Long carId){
        Car car = carRepository.findById(carId).get();
            return carMapper.carToDto(car);
    }

    public ResponseEntity<CarDto> addCar(Long modelId,
                                             CarDto carRequest){
        Car car = Car.builder()
                .carName(carRequest.getCarName())
                .build();

        Model model = modelRepository.findById(modelId).get();

        car.setModel(model);

        car = carRepository.save(car);

        return new ResponseEntity<>(carRequest, HttpStatus.CREATED);
    }

    public CarDto carUpdate(Car car, long id){
        Car car1= carRepository.findById(id).get();
         car1.setColor(car.getColor());
         car1.setPowerOfEngine(car.getPowerOfEngine());
         car1.setTypeOfCar(car.getTypeOfCar());
         car1.setEngine(car.getEngine());
         car1.setMile(car.getMile());
         car1.setTypeOfEngine(car.getTypeOfEngine());
         car1.setTypeOfFuel(car.getTypeOfFuel());
         car1.setTransmitter(car.getTransmitter());
         car1.setPrice(car.getPrice());

        carRepository.save(car1);
            return carMapper.carToDto(car1);

    }

    public CarDto carDelete(long carId){
        Car car1= carRepository.findById(carId).get();
        car1.setStatus(false);
        carRepository.save(car1);
        return carMapper.carToDto(car1);
    }


}
