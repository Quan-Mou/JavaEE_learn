package pers.quan.spring.service;
import pers.quan.spring.dao.UserDao;

public class UserService {
    private UserDao userDao;
    //set注入

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void save() {
        userDao.save();
    }
}
