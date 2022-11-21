package pers.quan.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.quan.spring.bean.MyInfo;
import pers.quan.spring.bean.MyInfo2;
import pers.quan.spring.bean.MyInfo3;
import pers.quan.spring.bean.Student;

public class TestCreatWay {

//    第一种是使用默认的构造方法创建bean


//    第二种：使用简单工程模式
    @Test
    public void TestCreate2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        MyInfo myInfoBean = applicationContext.getBean("myInfoBean", MyInfo.class);
        System.out.println(myInfoBean);
    }

//    第三种:使用工厂方法模式

    @Test
    public void TestCreate3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        MyInfo2 myInfo2 = applicationContext.getBean("myInfo2", MyInfo2.class);
        System.out.println(myInfo2);
    }

//    第四种：通过实现FactoryBean接口
//    你编写的类直接实现FactoryBean接口之后，factory-bean不需要指定了，factory-method也不需要指定了。
    @Test
    public void TestCreate4() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        MyInfo3 myInfo3Bean = applicationContext.getBean("myInfo3Bean", MyInfo3.class);
        System.out.println(myInfo3Bean);
    }

// FactoryBean应用
    @Test
    public void TestDateUse() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);
    }

}
