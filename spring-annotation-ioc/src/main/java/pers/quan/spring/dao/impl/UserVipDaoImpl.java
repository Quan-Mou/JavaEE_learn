package pers.quan.spring.dao.impl;

import org.springframework.stereotype.Component;
import pers.quan.spring.dao.vipDao;

@Component("userVipDaoBean")
public class UserVipDaoImpl implements vipDao {
    @Override
    public void save() {
        System.out.println("正在保存用户信息！");
    }
}
