package pers.quan.spring.jdbc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.spec.PSource;
import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

//@Component("MyDataSource")
public class MyDataSource implements DataSource {
//    @Value("com.mysql.cj.jdbc.Driver")
    private String driver;
//    @Value("jdbc:mysql://localhost:3306/spring6")
    private String url;
//    @Value("root")
    private String username;
//    @Value("zqh123")
    private String password;
    @Override
    public Connection getConnection() throws SQLException {
        try {
            System.out.println(driver);
            System.out.println(username);
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println(connection);
            return connection;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }


    public MyDataSource() {
        System.out.println("MyDataSource无参执行");
    }

    public String getDriver() {
        return driver;
    }



    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }
}
