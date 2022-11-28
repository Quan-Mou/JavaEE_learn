package pers.quan.spring.service;


import org.springframework.stereotype.Component;

@Component
public class LogService { // 目标对象

    public void login() {
        System.out.println("进入系统");
    }

    public void logout() {
        System.out.println("退出系统");
    }

}
