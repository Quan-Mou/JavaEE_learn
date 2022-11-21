package pers.quan.spring.bean;

/**
 *  级联属性赋值
 */
public class Cascade {

//  把这个类看做是一个学生类
    private String name;
    private Clazz clazz;

    public void setName(String name) {
        this.name = name;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public Clazz getClazz() {
        return clazz;
    }

    @Override
    public String toString() {
        return "Cascade{" +
                "name='" + name + '\'' +
                ", clazz=" + clazz +
                '}';
    }
}
