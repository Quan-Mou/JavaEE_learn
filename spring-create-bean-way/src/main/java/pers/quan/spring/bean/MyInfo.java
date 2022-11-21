package pers.quan.spring.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyInfo {

    private Logger logger = LoggerFactory.getLogger(MyInfo.class);

    public MyInfo() {
        logger.info("MyInfo加载了");
    }
}
