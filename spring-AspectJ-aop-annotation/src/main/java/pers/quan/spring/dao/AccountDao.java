package pers.quan.spring.dao;

import pers.quan.spring.pojo.Account;

public interface AccountDao {


    public int updata(Account act);

    public Account selectByName(String act);


}
