package pers.quan.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.quan.spring.bean.Vip;

public class TestFirstSpring {

    @Test
    public void TestFirstSpingCode() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Object userBean = applicationContext.getBean("UserBean");
        System.out.println(userBean);
        Vip vipBean = applicationContext.getBean("VipBean", Vip.class);
        vipBean.conMySql();
    }
}
