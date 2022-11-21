package org.myspring;

import org.dom4j.DocumentException;

public interface ApplicationContext {
    public Object getBean(String beanName) throws DocumentException;
}
