package pers.quan.spring.bean;

import org.springframework.beans.factory.FactoryBean;

public class MyInfo3FactoryBean<MyInfo3> implements FactoryBean {

    @Override
    public pers.quan.spring.bean.MyInfo3 getObject() throws Exception {
        return new pers.quan.spring.bean.MyInfo3();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}


