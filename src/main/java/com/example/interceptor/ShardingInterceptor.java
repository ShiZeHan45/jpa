package com.example.interceptor;

import com.example.annotation.ShardingColumn;
import org.apache.commons.beanutils.PropertyUtils;
import org.hibernate.CallbackException;
import org.hibernate.EmptyInterceptor;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;
import org.hibernate.type.Type;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/**
 * @description:
 * @author: Shizh
 * @create: 2021-03-20 16:41
 */
//@Component
public class ShardingInterceptor extends EmptyInterceptor {

    //TODO 需要校验一下此拦截是单例还是多例？ 如果是单例，局部变量线程不安全，高并发时会出问题
    private boolean shardingColumn = false;
    private String columnName;
    private String attributeValue;

//    @Override
//    public boolean onFlushDirty(Object entity, Serializable id, Object[] currentState, Object[] previousState, String[] propertyNames, Type[] types) {
//        init(entity);
//        return super.onFlushDirty(entity, id, currentState, previousState, propertyNames, types);
//    }
//
//    private void init(Object entity) {
//        if (entity.getClass().isAnnotationPresent(FilterDef.class)) {
//
//            shardingColumn = true;
//            ParamDef[] paramDefs = entity.getClass().getAnnotation(FilterDef.class).parameters();
//            //TODO 目前只有租户id 后续可能有生成时间，更新时间，更新人，等等。。。。
//            for (ParamDef paramDef : paramDefs) {
//                paramDef.name();
//                paramDef.type();
//            }
//            String attributeName = entity.getClass().getAnnotation(ShardingColumn.class).attributeName();
//            try {
//                attributeValue = PropertyUtils.getProperty(entity, attributeName).toString();
//            } catch (Exception e) {
//                throw new RuntimeException("ShardingInterceptor获取属性名称异常");
//            }
//        }
//    }
//
    @Override
    public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
//        init(entity);
        return super.onSave(entity, id, state, propertyNames, types);
    }

    @Override
    public String onPrepareStatement(String sql) {
        if (shardingColumn) {
            sql = sql.replace(" where ", " where " + columnName + " = '"
                    + attributeValue.replaceAll("'", "''") + "' AND ");
        }
        return super.onPrepareStatement(sql);
    }
}