package pers.quan.spring.bean;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component("orderBean")
public class Order {


    @Value("18")
    private Integer id;

//    @Value("20")
//    public void setId(Integer id) {
//        this.id = id;
//    }

    public void get() {
        System.out.println(id);
    }

    public Order() {
//        System.out.println(id);
    }

    //    public Order(Integer id) {
//        this.id = id;
//    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                '}';
    }
}
