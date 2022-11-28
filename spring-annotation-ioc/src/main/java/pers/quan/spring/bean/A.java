package pers.quan.spring.bean;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class A {

    public A() {
        System.out.println("A构造器执行");
    }
}

@Controller
class B {
    public B() {
        System.out.println("B构造器执行");
    }
}

@Service
class C {
    public C() {
        System.out.println("C构造器执行");
    }
}

@Repository
class D {
    public D() {
        System.out.println("D构造器执行");
    }
}



