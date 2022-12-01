package pers.quan.spring.dao;

import pers.quan.spring.pojo.Account;

public interface AccountDao {


    public int updata(Account act);

    public Account selectByName(String act);

//    测试事务的传播行为：
    public int save(Account act);


}
