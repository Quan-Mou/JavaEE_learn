package pers.quan.sping.test;

import pers.quan.spring.bean.User2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestUser {

    public static void main(String[] args) throws Exception{
        String Clazz = "pers.quan.spring.bean.User2";
        String name = "name";
        String age = "age";

        Class<?> aClass = Class.forName(Clazz);
        User2 user = (User2)aClass.newInstance();

//      获取方法
        String nameMethod = "set" + name.toUpperCase().charAt(0) + name.substring(1);
        String ageMethod = "set" + age.toUpperCase().charAt(0) + age.substring(1);

//      获取属性
        Class nameType = aClass.getDeclaredField(name).getType();
        Class ageType = aClass.getDeclaredField(age).getType();

        Method setName = aClass.getDeclaredMethod(nameMethod, nameType);
//        调用setName赋值
        setName.invoke(user,"zhangsan");
        Method setAge = aClass.getDeclaredMethod(ageMethod, ageType);
//        调用setAge赋值
        setAge.invoke(user,20);
        System.out.println(user);
    }

}
