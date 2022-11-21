package pers.quan.spring.test;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import pers.quan.spring.bean.User;

public class TestRegisterBean {
//    手动添加Bean到Spring容器中
    @Test
    public void TestRegisterBean1() {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        User u = new User();

//        注册Bean
        factory.registerSingleton("userBean",u);

//        容器中获取Bean
        User userBean = factory.getBean("userBean", User.class);
        userBean.setAge(19);
        System.out.println(userBean);
    }

}
