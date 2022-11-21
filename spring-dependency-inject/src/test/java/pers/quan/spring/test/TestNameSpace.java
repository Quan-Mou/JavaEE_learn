package pers.quan.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.quan.spring.bean.*;

public class TestNameSpace {

    @Test
    public void TestPropertyFile() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-name-space.xml");
        ProPertyFile propertyFile = applicationContext.getBean("propertyFile", ProPertyFile.class);
        System.out.println(propertyFile);
    }

    @Test
    public void TestUitlMy2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-name-space.xml");
        MyDateSource1 md1 = applicationContext.getBean("md1", MyDateSource1.class);
        System.out.println(md1);
    }

    @Test
    public void TestUtilMy1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-name-space.xml");
        MyDateSource2 md2 = applicationContext.getBean("md2", MyDateSource2.class);
        System.out.println(md2);
    }

//    C命名空间注入
    @Test
    public void TestNameSpaceC() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-name-space.xml");
        NameSpaceC C = applicationContext.getBean("nameSpacePBena", NameSpaceC.class);
        System.out.println(C);
    }

    @Test
    public void TestNameSpaceP() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-name-space.xml");
        NameSpace nameSpaceBean = applicationContext.getBean("nameSpaceBean", NameSpace.class);
        System.out.println(nameSpaceBean);
    }
}
