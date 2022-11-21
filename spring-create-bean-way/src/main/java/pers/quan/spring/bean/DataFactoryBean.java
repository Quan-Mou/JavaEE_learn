package pers.quan.spring.bean;

import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataFactoryBean implements FactoryBean<Date> {

//    定义属性接收日期字符串
    private String date;

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public Date getObject() throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dataTime = simpleDateFormat.parse(this.date);
        System.out.println(dataTime);
        return dataTime;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
