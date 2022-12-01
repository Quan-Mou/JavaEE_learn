package pers.quan.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.quan.spring.Spring6Config;
import pers.quan.spring.pojo.Account;
import pers.quan.spring.service2.Service2;
import pers.quan.spring.service3.Service3;

public class TestTransactionPropagation {

//    全注解式：
    @Test
    public  void testService2Anntation() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        Service2 service2 = annotationConfigApplicationContext.getBean("service2", Service2.class);
        Account act = new Account("act003", 18000);
        service2.save(act);
    }

    @Test
    public void testService2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Service2 service2 = applicationContext.getBean("service2", Service2.class);
        Account act = new Account("act003", 18000);
        service2.save(act);
    }
}
