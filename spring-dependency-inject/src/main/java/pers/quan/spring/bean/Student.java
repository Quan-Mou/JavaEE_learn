package pers.quan.spring.bean;

import java.sql.Date;

public class Student {

    private String name;
    private int age;
    private Boolean isGender;

    private Date birth;

    public void setIsGender(Boolean gender) {
        isGender = gender;
    }

    public Boolean getGender() {
        return isGender;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isGender=" + isGender +
                ", birth=" + birth +
                '}';
    }

}
