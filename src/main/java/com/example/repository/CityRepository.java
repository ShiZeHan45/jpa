package com.example.repository;

import com.example.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface CityRepository extends JpaRepository<City,Long> {


//    City findByName(String name);
    List<City> findByName(String name);


    @Query(value = "SELECT c FROM City c where c.name=:name")
    City findByName4HQL(@Param(value = "name")String name);

    @Query(value = "SELECT c.* FROM city c where c.name=:name",nativeQuery = true)
    City findByName2(@Param(value = "name")String name);

    void deleteByName(String name);

    @Modifying
    @Query(value = "DELETE  FROM City  where name=:name")
    void deleteByName4HQL(@Param(value = "name")String name);
}
