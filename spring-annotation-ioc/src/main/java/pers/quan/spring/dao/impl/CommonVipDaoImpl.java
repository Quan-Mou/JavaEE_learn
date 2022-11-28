package pers.quan.spring.dao.impl;

import org.springframework.stereotype.Component;
import pers.quan.spring.dao.vipDao;

@Component
public class CommonVipDaoImpl implements vipDao {

    @Override
    public void save() {
        System.out.println("正在保存普通用户信息");

    }
}
