package pers.quan.spring.test;

import pers.quan.spring.pojo.Account;

public class Test {

    @org.junit.Test
    public void Test() {
        Account account = new Account();
        System.out.println(account.getBalance());

    }
}
