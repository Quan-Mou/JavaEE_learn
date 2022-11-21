package pers.quan.spring.bean;

import java.util.Date;

public class Student {

    private Date birth; // 生日

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "birth=" + birth +
                '}';
    }
}
