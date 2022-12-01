package pers.quan.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.quan.spring.service.AccountService;

public class Test {

    @org.junit.Test
    public void Testtransfer() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountServiceImpl = applicationContext.getBean("accountServiceImpl", AccountService.class);
        try {
            accountServiceImpl.transfer("act001","act002",1000);
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}
