package pers.quan.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.quan.spring.bean.Cascade;

public class TestCascade {

    @Test
    public void TestCascade1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("simpleness.xml");
        Cascade bean = applicationContext.getBean("CascadeBena", Cascade.class);
        System.out.println(bean);
    }
}
