package com.example.entity;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;

@Aspect
@Component
public class RepositoryAspect {
    @Autowired
    EntityManager entityManager;

    @Before("execution(* org.springframework.data.repository.Repository+.*(..))")
    public void before(JoinPoint joinPoint) throws Throwable {
        if (entityManager.isOpen()) {
            Session session = entityManager.unwrap(Session.class);
            //TODO 此处等租户正式启用时会改成从访问的接口中拦截租户id赋值到全局属性，在全局属性中取租户id赋值
            String id = "1";
            session.enableFilter("tenantFilter").setParameter("tenantId", id);
        }
    }
}
