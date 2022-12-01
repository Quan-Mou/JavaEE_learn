package pers.quan.spring;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("pers.quan.spring")
//开启事务支持，等同于xml配置文件中的: <tx:annotation-driven transaction-manager="txManager"/>
@EnableTransactionManagement
public class Spring6Config {

//    @Bean(name = "Bean的名字")
//    Spirng框架，看到@Bean这个注解后，会调用这个被注解的方法，这个方法的返回值是一个Java对象、这个Java对象会自动纳入IOC容器管理
//    返回的对象就是Spring容器当中的一个Bean了，名字就是里面指定的名字
    @Bean
    public DruidDataSource getDruidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/spring6");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("zqh123");
        return druidDataSource;
    }

    @Bean(name = "jdbcTemplate")
    public JdbcTemplate getJdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
//       方式一：
        jdbcTemplate.setDataSource(getDruidDataSource());
        return jdbcTemplate;
    }

    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DruidDataSource druidDataSource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
//      方式二：传参，会根据类型自动注入
        dataSourceTransactionManager.setDataSource(druidDataSource);
        return dataSourceTransactionManager;
    }

}
