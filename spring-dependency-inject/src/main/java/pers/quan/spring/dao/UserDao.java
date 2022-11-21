package pers.quan.spring.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDao {

    private Logger logger = LoggerFactory.getLogger(UserDao.class);
    public void save() {
        logger.info("正在保存数据");
    }
}
