package pers.quan.spring.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pers.quan.spring.bean.Log4J2;

public class VipDao {
    private Logger logger = LoggerFactory.getLogger(VipDao.class);
    public void save() {
        logger.info("正在保存Vip信息……");
    }
}
