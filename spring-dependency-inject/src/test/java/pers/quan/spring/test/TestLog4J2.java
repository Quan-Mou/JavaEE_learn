package pers.quan.spring.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pers.quan.spring.bean.Log4J2;

public class TestLog4J2 {

    @Test
    public void TestLog4j2(){
        Logger logger = LoggerFactory.getLogger(Log4J2.class);
        logger.info("正在加载中……");
        logger.error("出现了错误！！");
    }
}
