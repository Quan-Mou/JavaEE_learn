package pers.quan.spring.bean;

import java.util.Properties;

public class MyDateSource1 {
//    private String driver;
//    private String url;
//    private String username;
//    private String password;

    private Properties properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "MyDateSource1{" +
                "properties=" + properties +
                '}';
    }
}
