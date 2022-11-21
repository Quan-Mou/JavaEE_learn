package pers.quan.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.quan.spring.service.VipService;

public class TestConstructDi {

    @Test
    public void TestConstruct1() {
        ApplicationContext application = new ClassPathXmlApplicationContext("construct.xml");
        VipService vipServiceBean = application.getBean("VipServiceBean", VipService.class);
        vipServiceBean.VipInfo();
    }
}
