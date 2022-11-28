package pers.quan.spring.dao.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import pers.quan.spring.bean.User;
import pers.quan.spring.dao.UserDao;
import pers.quan.spring.uitls.GetJdbcTemplate;

import java.util.List;
import java.util.Map;

@Repository("userServiceBean")
public class UserDaoImpl implements UserDao {
    @Override
    public int insert(User user) {
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyDataSource.class);
//        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "insert into t_user values(?,?,?)";
        int count = jdbcTemplate.update(sql, user.getId(), user.getRealName(), user.getAge());
        return count;
    }


    @Override
    public int modify(User user,Integer id) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "update t_user set real_name = ?, age = ? where id = ?";
        int update = jdbcTemplate.update(sql, user.getRealName(), user.getAge(), id);
        return update;
    }

    @Override
    public int delete(Integer id) {
        JdbcTemplate jdbcTemplate = GetJdbcTemplate.getJdbcTemplate();
        String sql = "delete from t_user where id = ?";
        return jdbcTemplate.update(sql, id);
    }

    @Override
    public User selectById(Integer id) {
        JdbcTemplate jdbcTemplate = GetJdbcTemplate.getJdbcTemplate();
        String sql = "select real_name,age from t_user where id = ?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), id);
        return user;
    }

    @Override
    public List<User> selectAll() {
        JdbcTemplate jdbcTemplate = GetJdbcTemplate.getJdbcTemplate();
        String sql = "select * from t_user";
//        List<User> users = jdbcTemplate.queryForList(sql, User.class);
        List query = jdbcTemplate.query(sql, new BeanPropertyRowMapper(User.class));
        return query;
    }

    @Override
    public int selectCount() {
        JdbcTemplate jdbcTemplate = GetJdbcTemplate.getJdbcTemplate();
        String sql = "select count(*) from t_user";
        Integer integer = jdbcTemplate.queryForObject(sql, int.class);
        return integer;
    }
}
