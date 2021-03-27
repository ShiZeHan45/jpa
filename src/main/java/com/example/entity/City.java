package com.example.entity;


import com.example.entity.base.MultiTenantSupport;

import javax.persistence.*;

@Entity
@Table(name = "city")
public class City extends MultiTenantSupport {

    //主键id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //城市名称
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
