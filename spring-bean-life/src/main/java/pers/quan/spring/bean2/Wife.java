package pers.quan.spring.bean2;

public class Wife {
    private String name;
    private Husband husband;

    public void setHusband(Husband husband) {
        this.husband = husband;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "name='" + name + '\'' +
                ", husband=" + husband.getName() +
                '}';
    }
}
