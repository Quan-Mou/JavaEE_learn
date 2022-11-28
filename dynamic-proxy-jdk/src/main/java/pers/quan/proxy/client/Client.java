package pers.quan.proxy.client;

import pers.quan.proxy.service.OrderService;
import pers.quan.proxy.service.OrderServiceImpl;
import pers.quan.proxy.service.TimeInvocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        //    在静态代理中需要：1.公共接口 2.目标对象 3.代理对象

        //      在动态代理中，不需要自己创建代理对象，由newProxyInstance在内存中生成，我们只需要调用就好
        //      public static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
//                第一个参数：内存生成了字节码，要想执行这个字节码，就需要把这个字节码加载到内存中，所以要指定那个类加载器加载
//                 第二个参数：接口类型，代理类和目标类实现相同的接口，，通过这个参数告诉jdk动态代理要实现哪些接口
//        第三个参数：调用处理器，回调接口


        //    目标对象
        OrderService target = new OrderServiceImpl();

        OrderService order = (OrderService) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new TimeInvocationHandler(target));
        order.generate();
        order.modify();
        order.detail();



    }



}
