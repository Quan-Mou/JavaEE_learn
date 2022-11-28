package pers.quan.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import pers.quan.spring.config.Spring6Configuration;
import pers.quan.spring.jdbc.MyDataSource;
import pers.quan.spring.service.UserService;

public class TsetJdbcTemplate {

    @Test
    public void crud() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Configuration.class);
        UserService userService = applicationContext.getBean("userService", UserService.class);
//        userService.deleteUser();
//        userService.selectById();
//        userService.selectAll();
        userService.count();

    }

//    修改数据
    @Test
    public void modify() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Configuration.class);
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.modifyUser();
    }

//     添加数据
    @Test
    public void inset() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Configuration.class);
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.addUser();
    }




}
