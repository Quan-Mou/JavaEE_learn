package pers.quan.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.quan.spring.bean.Order;
import pers.quan.spring.config.Spring6Configuration;
import pers.quan.spring.service.vipService;

public class TestAnnotation {

    @Test
    public void TestAnnotation1() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//        Order orderBean = applicationContext.getBean("orderBean", Order.class);
//        System.out.println(orderBean);
//
//        vipService vipService = applicationContext.getBean("vipServiceBean", vipService.class);
//        System.out.println(vipService);
//        vipService.generate();
//        vipService.generate2();



//        全注解式开发
        ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(Spring6Configuration.class);
        Order orderBean1 = applicationContext2.getBean("orderBean", Order.class);
        System.out.println(orderBean1);
        vipService vipService2 = applicationContext2.getBean("vipServiceBean", vipService.class);
        System.out.println(vipService2);
        vipService2.generate();
        vipService2.generate2();


    }

}
