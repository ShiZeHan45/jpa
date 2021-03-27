package com.example.service;

import com.example.entity.City;
import com.example.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.SQLException;
import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    @PersistenceContext
    public EntityManager entityManager;

    /**
     * 根据DTO对实体类进行更新或插入的操作
     *
     *@Author: Shizh
     *@Param:
     * @param city DTO
     *@return: void
     *@date: 2021-03-22
     */
    @Transactional
    public void save(City city){
        if(city.getId()!=null){
            //id可能不存在
            City persistCity = cityRepository.findById(city.getId()).orElseThrow(()->new RuntimeException(String.format("根据id【%s】找不到对应记录",city.getId())));
            persistCity.setName(city.getName());
            cityRepository.save(city);
        }else{
            //直接持久化，跳过save中的isNew判断，提高性能
            entityManager.persist(city);
        }
    }

    /**
     * 查询
     *
     *@Author: Shizh
     *@Param:
     *@return: java.util.List<com.example.entity.City>
     *@date: 2021-03-22
     */
    public List<City> getAll() throws SQLException {
        return cityRepository.findAll();
    }

    /**
     *
     * 根据id查询
     *@Author: Shizh
     *@Param:
     * @param id
     *@return: com.example.entity.City
     *@date: 2021-03-22
     */
    public City get(Long id){

        return cityRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("根据id【%s】找不到对应记录",id)));
    }

    /**
     * HQL查询
     *
     *@Author: Shizh
     *@Param:
     * @param name
     *@return: com.example.entity.City
     *@date: 2021-03-22
     */
    public City getByName(String name){
        return cityRepository.findByName4HQL(name);
    }

    /**
     * HQL删除
     *
     *@Author: Shizh
     *@Param:
     * @param name
     *@return: void
     *@date: 2021-03-22
     */
    @Transactional
    public void delete(String name){
        cityRepository.deleteById(1L);
    }
}
