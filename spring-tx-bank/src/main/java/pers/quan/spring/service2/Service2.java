package pers.quan.spring.service2;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import pers.quan.spring.dao.AccountDao;
import pers.quan.spring.pojo.Account;
import pers.quan.spring.service3.Service3;

@Service
public class Service2 {

    @Resource(name = "service3")
    private Service3 service3;

    @Resource(name = "accountDaoImpl")
    private AccountDao accountDao;

//    @Transactional(propagation = Propagation.REQUIRED)
    @Transactional(propagation = Propagation.REQUIRED)
    public void save(Account act) {
        accountDao.save(act);
        service3.save(act);

        String s = null;
        s.toString();

    }


}
