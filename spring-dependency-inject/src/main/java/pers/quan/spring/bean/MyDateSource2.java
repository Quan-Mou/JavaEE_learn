package pers.quan.spring.bean;

import java.util.Properties;

public class MyDateSource2 {

    private Properties properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "MyDateSource2{" +
                "properties=" + properties +
                '}';
    }
}
