package com.example.rentacar.service;

import com.example.rentacar.entity.Marka;
import com.example.rentacar.entity.MarkaDto;
import com.example.rentacar.mapper.MarkaMapper;
import com.example.rentacar.repository.MarkaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MarkaService {
    private final MarkaRepository markaRepository;
    private final MarkaMapper markaMapper;

    public List<MarkaDto> markaGet(){
        List<Marka> markas = markaRepository.findAll();

        return markaMapper.markaToDtoList(markas);
    }

    public MarkaDto markaGetById(Long markaId){
       return markaMapper.markaToDto(markaRepository.findById(markaId).get());
    }

    public MarkaDto markaAdd(Marka marka) {
        Marka marka1=markaRepository.save(marka);
        return markaMapper.markaToDto(marka1);
    }

    public  MarkaDto markaUpdate(Marka marka,long markaId){

        Marka marka1= markaRepository.findById(markaId).get();
        marka1.setMarkaName(marka.getMarkaName());
        markaRepository.save(marka1);
        return markaMapper.markaToDto(marka1);

    }

    public  void markaDelete(long markaId){
        Marka marka= markaRepository.findById(markaId).get();
        marka.setMarkaStatus(false);
        markaRepository.save(marka);
        markaMapper.markaToDto(marka);
    }
}
