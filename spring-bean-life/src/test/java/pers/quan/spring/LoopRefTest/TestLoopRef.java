package pers.quan.spring.LoopRefTest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.quan.spring.bean2.Husband;
import pers.quan.spring.bean2.Wife;

public class TestLoopRef {

    @Test
    public void TestLoop() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring2.xml");
        Wife wifeBean = applicationContext.getBean("wifeBean", Wife.class);
        Husband husbandBean = applicationContext.getBean("husbandBean", Husband.class);
        System.out.println(husbandBean);
        System.out.println(wifeBean);
    }
}
