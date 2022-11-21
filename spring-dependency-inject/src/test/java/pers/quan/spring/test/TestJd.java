package pers.quan.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.quan.spring.bean.Student;

public class TestJd {
    @Test
    public void TestStudent() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("simpleness.xml");
        Student studentBean = applicationContext.getBean("StudentBean", Student.class);
        System.out.println(studentBean);
    }
}
