package pers.quan.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.quan.spring.service2.AccountService2;
import pers.quan.spring.service2.UserService;

public class TestExer1 {

    @Test
    public void testTransaction2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aspectj-aop-annotation.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.getUser();
        userService.addUser();
        userService.modifyUser();
        userService.deleteUser();
    }

    @Test
    public void testTransaction1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aspectj-aop-annotation.xml");
        AccountService2 accountService = applicationContext.getBean("accountService2", AccountService2.class);
        accountService.transfer();
        accountService.withdrawal();
    }
}
