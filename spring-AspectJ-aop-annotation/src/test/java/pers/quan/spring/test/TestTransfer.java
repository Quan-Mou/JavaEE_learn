package pers.quan.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.quan.spring.service2.AccountService;

public class TestTransfer {

    @Test
    public void Testtransfer() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aspectj-aop-annotation.xml");
        AccountService accountServiceImpl = applicationContext.getBean("accountServiceImpl", AccountService.class);
        accountServiceImpl.transfer("act001","act002",1000);


    }

}
