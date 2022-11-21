package pers.quan.spring.bean2;

public class Husband {

    private String name;
    private Wife wife;

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Husband{" +
                "name='" + name + '\'' +
                ", wife=" + wife.getName() +
                '}';
    }
}
