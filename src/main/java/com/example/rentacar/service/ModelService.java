package com.example.rentacar.service;


import com.example.rentacar.entity.Marka;
import com.example.rentacar.entity.Model;
import com.example.rentacar.entity.ModelDto;
import com.example.rentacar.mapper.ModelMapper;
import com.example.rentacar.repository.CarRepository;
import com.example.rentacar.repository.MarkaRepository;
import com.example.rentacar.repository.ModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ModelService {
    private final ModelRepository modelRepository;
    private final MarkaRepository markaRepository;
    private final CarRepository carRepository;
    private final ModelMapper modelMapper;

    public List<ModelDto> modelGet(){
        List<Model> model = modelRepository.findAll();

        return modelMapper.modelToDtoList(model);
    }

    public ModelDto modelGetById(Long modelId){
      return   modelMapper.modelToDto(modelRepository.findById(modelId).get());
    }
    public ResponseEntity<ModelDto> addModel(Long markaId,
                          ModelDto modelRequest){
        Model model = Model.builder()
                .modelName(modelRequest.getModelName())
                .build();

        Marka marka = markaRepository.findById(markaId).get();

        model.setMarka(marka);

        model = modelRepository.save(model);

        return new ResponseEntity<>(modelRequest, HttpStatus.CREATED);
    }

    public ModelDto updateModel(Long modelId, Model model1){
        Model model= modelRepository.findById(modelId).get();
        model.setModelName(model1.getModelName());
        modelRepository.save(model);
        return modelMapper.modelToDto(model);

    }



    public void modelDelete (Long modelId){
        Model model= modelRepository.findById(modelId).get();
        model.setModelStatus(false);
        modelRepository.save(model);
        modelMapper.modelToDto(model);
    }


}
