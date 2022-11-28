package pers.quan.spring.service;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import pers.quan.spring.bean.User;
import pers.quan.spring.dao.UserDao;

import java.util.List;

@Service
public class UserService {

    @Resource(name = "userServiceBean")
    private UserDao userdao;

    public void addUser() {
        User user = new User(null, "萧炎", 19);
        System.out.println(userdao.insert(user));
    }

    public void modifyUser() {
        User user = new User(null, "吉祥宝宝", 21);
        int modify = userdao.modify(user, 7);
        System.out.println(modify);
    }

    public void deleteUser() {
        System.out.println(userdao.delete(6));
    }

    public void selectById() {
        User user = userdao.selectById(7);
        System.out.println(user);
    }

    public void selectAll() {
        List<User> users = userdao.selectAll();
        users.forEach(item -> {
            System.out.println(item);
        });
    }

    public void count() {
        int i = userdao.selectCount();
        System.out.println(i);

    }

}
