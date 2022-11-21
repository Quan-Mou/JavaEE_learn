package pers.quan.spring.bean;

public class NameSpaceC {

//    C命名空间注入
    private String name;
    private Integer age;

    public NameSpaceC(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "NameSpaceC{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
