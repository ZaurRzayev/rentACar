package com.example.rentacar.controller;


import com.example.rentacar.entity.Marka;
import com.example.rentacar.entity.MarkaDto;
import com.example.rentacar.service.MarkaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/rentCar")
public class MarkaController {

    private final MarkaService markaService;

    @GetMapping("/getMarka")
    public List<MarkaDto> markaGet(){
       return markaService.markaGet();
    }

    @GetMapping("/getMarka/{markaId}")
    public MarkaDto markaGetById(@PathVariable("markaId") Long markaId){
      return markaService.markaGetById(markaId);
    }

    @PostMapping("/addMarka")
    public MarkaDto addMarka(@RequestBody Marka marka) {
        return markaService.markaAdd(marka);
    }

    @PutMapping("/markaUpdate/{markaId}")
    public MarkaDto markaUpdate(@PathVariable("markaId") Long markaId,@RequestBody Marka marka){
        return  markaService.markaUpdate(marka,markaId);
    }

    @DeleteMapping("/markaDelete/{markaId}")
    public void markaDelete(@PathVariable("markaId") Long markaId){
       markaService.markaDelete(markaId);
    }
}
