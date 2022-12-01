package pers.quan.spring.service2;


import org.springframework.stereotype.Service;

@Service
public class UserService {

//    获取用户
    public void getUser() {
        System.out.println("正在获取用户");
    }

//    修改用户
    public void modifyUser() {
        System.out.println("正在修改用户");
    }

    public void addUser() {
        System.out.println("正在添加用户");
    }

    public void deleteUser() {
        System.out.println("正在删除用户");
    }



}
