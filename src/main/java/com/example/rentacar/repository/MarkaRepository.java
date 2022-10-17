package com.example.rentacar.repository;

import com.example.rentacar.entity.Marka;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarkaRepository extends JpaRepository<Marka, Long> {

}
