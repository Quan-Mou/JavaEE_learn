package pers.quan.spring.service3;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import pers.quan.spring.dao.AccountDao;
import pers.quan.spring.pojo.Account;

//@Service("service3")
@Component("service3")
public class Service3 {

    @Resource(name = "accountDaoImpl")
    private AccountDao accountDao;

//    @Transactional(propagation = Propagation.REQUIRED)
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void save(Account act) {

        Account act1 = new Account("act004", 18000);
        accountDao.save(act1);

//        String s = null;
//        s.toString();

//        try {
//            Thread.sleep(1000*20);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
