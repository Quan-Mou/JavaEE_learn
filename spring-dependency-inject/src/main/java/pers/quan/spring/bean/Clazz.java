package pers.quan.spring.bean;

public class Clazz {
//    班级名称
//    private String classname;

    private String className;
//    private String

    public void setClassname(String classname) {
        this.className = classname;
    }

    public String getClassname() {
        return className;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "className='" + className + '\'' +
                '}';
    }
}
