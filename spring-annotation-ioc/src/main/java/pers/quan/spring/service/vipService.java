package pers.quan.spring.service;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pers.quan.spring.dao.vipDao;


@Component("vipServiceBean")
public class vipService {


//    @Autowired
    private vipDao vipDao;
    @Autowired
    @Qualifier("commonVipDaoImpl")
    private vipDao vipDao2;
//    @Resource
//    private vipDao user;
    private String level;
    @Resource(name = "userVipDaoBean")
    private vipDao userVipDaoImpl;

    public vipService(@Autowired @Qualifier("vipDaoImpl") pers.quan.spring.dao.vipDao vipDao,@Value("顶级") String level) {
        this.vipDao = vipDao;
        this.level  = level;
    }

    public void generate() {
        vipDao.save();
    }
    public void generate2() {
        vipDao2.save();
    }

    public void generate3() {
//        user.save();
        userVipDaoImpl.save();
    }

}
