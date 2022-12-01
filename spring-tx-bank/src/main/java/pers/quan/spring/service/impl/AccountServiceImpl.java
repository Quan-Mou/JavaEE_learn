package pers.quan.spring.service.impl;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.quan.spring.dao.AccountDao;
import pers.quan.spring.pojo.Account;
import pers.quan.spring.service.AccountService;

@Component
public class AccountServiceImpl implements AccountService {
    @Resource(name = "accountDaoImpl")
    private AccountDao accountDao;

//   转账
    @Override
    @Transactional
    public void transfer(String fromAct, String toAct, double balance) {
//        查询要转账的账户余额是否足够
        Account fromA = accountDao.selectByName(fromAct);
        Account toA = accountDao.selectByName(toAct);



        if(fromA.getBalance() > balance) {
            fromA.setBalance(fromA.getBalance() - balance);
            toA.setBalance(toA.getBalance() + balance);

            int count = accountDao.updata(fromA);
//            模拟异常
            String a = null;
            a.toString();

            count +=accountDao.updata(toA);
            if (count == 2) {
                System.out.println("转账成功");
            } else {
                System.out.println("转账失败");
                throw new RuntimeException("转账失败，请联系银行");
            }
        } else {
            System.out.println("余额不足");
        }
    }
}
