package pers.quan.sping.test;

import org.junit.Test;
import pers.quan.spring.bean.User;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflect {

    @Test
    public void TestReflect1() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, ClassNotFoundException {

//        通过反射获取User的无参方法
        Class clazz = Class.forName("pers.quan.spring.bean.User");
        User user = (User) clazz.newInstance();
        Method test = clazz.getDeclaredMethod("test");
        test.invoke(user);

//        通过反射获取User的test(String,int)方法
        Method test1 = clazz.getDeclaredMethod("test", String.class, int.class);
        Object me = test1.invoke(user, "权某", 18);
        System.out.println(me);
    }


}
