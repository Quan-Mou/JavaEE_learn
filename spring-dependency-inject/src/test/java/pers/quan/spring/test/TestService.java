package pers.quan.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.quan.spring.service.UserService;

public class TestService {
    @Test
    public void TestUserSerive1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userServiceBean = applicationContext.getBean("UserServiceBean", UserService.class);
        userServiceBean.save();
    }

}
