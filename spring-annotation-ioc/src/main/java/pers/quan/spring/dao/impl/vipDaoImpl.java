package pers.quan.spring.dao.impl;

import org.springframework.stereotype.Controller;
import pers.quan.spring.dao.vipDao;

@Controller
public class vipDaoImpl implements vipDao {


    @Override
    public void save() {
        System.out.println("正在保存Vip信息");
    }
}
