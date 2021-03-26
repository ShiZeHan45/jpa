package com.example.entity;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;

import javax.persistence.*;

/**
 * @description:
 * @author: Shizh
 * @create: 2021-03-22 10:18
 */
@FilterDef(name = "tenantFilter", parameters = {@ParamDef(name = "tenantId", type = "string")})
@Filter(name = "tenantFilter", condition = "tenant_id = :tenantId")
@MappedSuperclass
public class MultiTenantSupport {
    @Column(name = "tenant_id")
    private String tenantId;

    @PrePersist
    @PreUpdate
    @PreRemove
    public void preExecute(){
        //TODO 此处等租户正式启用时会改成从访问的接口中拦截租户id赋值到全局属性，在全局属性中取租户id赋值
        this.tenantId = "1";
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
}