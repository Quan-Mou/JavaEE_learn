package pers.quan.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class User implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, InitializingBean, DisposableBean {
    private Integer age;

    public void setAge(Integer age) {
        System.out.println("第二步：属性赋值");
        this.age = age;
    }

    public User() {
        System.out.println("第一步：实例化");
    }

    public void initBean() {
        System.out.println("第六步：初始化Bean");
    }

    public void destroyBean() {
        System.out.println("第十步：销毁Bean");
    }


    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("第三步：类加载器：" + classLoader);

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("第三步：Bean工厂："+ beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("第三步：Bean名称"+ name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("第九步：DisposableBean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("第五步：afterPropertiesSet执行");
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                '}';
    }
}
