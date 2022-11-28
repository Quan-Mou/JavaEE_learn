package pers.quan.proxy.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeInvocationHandler implements InvocationHandler {
//    目标方法
    private OrderService target;

    public TimeInvocationHandler(OrderService target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


//        第一个参数：代理对象的引用
//        第二个参数：目标方法
//        第三个参数：目标方法调用时要传的参数
        long start = System.currentTimeMillis();
        System.out.println("目标方法名:" + method.getName());
        Object returVal = method.invoke(target);
        long end = System.currentTimeMillis();
        System.out.println("执行花费了：" + (end - start) + "毫秒");
        return returVal;
    }
}
