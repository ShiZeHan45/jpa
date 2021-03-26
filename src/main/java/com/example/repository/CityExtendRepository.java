package com.example.repository;

import com.example.entity.BCity;
import com.example.entity.City;
import com.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface CityExtendRepository extends JpaRepository<BCity,Long> {

    BCity getById(Long id);

    List<BCity> findByName(String name);


    void deleteByName(String name);
}
