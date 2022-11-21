package pers.quan.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.quan.spring.bean.QingDaYe;

public class TestArray {
    @Test
    public void TestArray1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("array-di.xml");
        QingDaYe qiDaYeBean = applicationContext.getBean("QingDaYeBean", QingDaYe.class);
        System.out.println(qiDaYeBean);
    }
}
