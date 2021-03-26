package com.example.entity;

import javax.persistence.*;

/**
 * @description:
 * @author: Shizh
 * @create: 2021-03-24 10:51
 */
//多表不用数据库
@Entity
@Table(name = "city",catalog = "multitenant")
@SecondaryTable(name = "city_extend",catalog = "b_city",
        pkJoinColumns = @PrimaryKeyJoinColumn(name = "id"))
public class BCity extends MultiTenantSupport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",table = "city_extend")
    private Long extendId;

    @Column(name = "count",table = "city_extend")
    private Integer count;

    public Long getExtendId() {
        return extendId;
    }

    public void setExtendId(Long extendId) {
        this.extendId = extendId;
    }

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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}