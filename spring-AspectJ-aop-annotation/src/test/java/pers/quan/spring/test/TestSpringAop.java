package pers.quan.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.quan.spring.service.LogService;

public class TestSpringAop {

    @Test
    public void TestAopAnnotation() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aspectj-aop-annotation.xml");
        LogService logService = applicationContext.getBean("logService", LogService.class);
        logService.login();
        logService.logout();
    }
}
