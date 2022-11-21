package pers.quan.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.quan.spring.bean.User;

public class TestBeanFLife {

    @Test
    public void TestBeanFLife1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User userBean = applicationContext.getBean("userBean", User.class);
//
//        System.out.println(userBean);
        System.out.println("第八步：使用Bean");

//        只有正常关闭spring容器才会执行销毁方法

        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) applicationContext;
        context.close();


    }
}
