package pers.quan.spring.service;

import pers.quan.spring.dao.UserDao;
import pers.quan.spring.dao.VipDao;

public class VipService {

    private VipDao vip;
    private UserDao userDao;

    public VipService(VipDao vip,UserDao userDao) {
        this.vip = vip;
        this.userDao = userDao;
    }

    public void VipInfo() {
        vip.save();
        userDao.save();
    }


}
