package pers.quan.spring.uitls;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class GetJdbcTemplate {
    public static org.springframework.jdbc.core.JdbcTemplate getJdbcTemplate() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        return jdbcTemplate;
    }

}
