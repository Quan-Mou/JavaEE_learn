package pers.quan.spring.dao.impl;

import jakarta.annotation.Resource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import pers.quan.spring.dao.AccountDao;
import pers.quan.spring.pojo.Account;

import java.util.List;

@Component
public class AccountDaoImpl implements AccountDao {

    @Override
    public int updata(Account act) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aspectj-aop-annotation.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "update t_act set balance = ? where actno = ? ";
        int count = jdbcTemplate.update(sql, act.getBalance(), act.getActno());
        return count;
    }

    @Override
    public Account selectByName(String act) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aspectj-aop-annotation.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "select actno,balance from t_act where actno = ?";
        Account account = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Account.class),act);
        return account;
    }
}
