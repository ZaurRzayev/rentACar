package com.example.rentacar.controller;

import com.example.rentacar.entity.Model;
import com.example.rentacar.entity.ModelDto;
import com.example.rentacar.service.ModelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//tutorial -- marka
//comment  -- model
@RestController
@RequiredArgsConstructor
@RequestMapping("/rentCar")
public class ModelController {

    private final ModelService modelService;

    @GetMapping("/{markaId}/getModel")
    public ModelDto modelGetById(@PathVariable("markaId") Long markaId){
        return modelService.modelGetById(markaId);
    }

    @GetMapping("/getModel")
    public List<ModelDto> modelGet(){
        return modelService.modelGet();
    }

    @PostMapping("/addModel/modelId/{modelId}")
    public ResponseEntity<ModelDto> modelCreate(@PathVariable(value = "modelId") Long modelId,@RequestBody ModelDto modelRequest) {
        return modelService.addModel(modelId,modelRequest);
    }

    @PutMapping("/modelUpdate/{modelId}")
    public  ModelDto modelUpdate(@PathVariable(value = "modelId") Long modelId, @RequestBody Model model){
        return modelService.updateModel(modelId,model);
    }

    @DeleteMapping("/modelDelete/{modelId}")
    public void modelDelete(@PathVariable (value = "modelId") Long modelId){
         modelService.modelDelete(modelId);
    }

}
