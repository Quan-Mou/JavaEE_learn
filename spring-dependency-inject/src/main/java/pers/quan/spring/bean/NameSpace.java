package pers.quan.spring.bean;

public class NameSpace {

    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "NameSpace{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
