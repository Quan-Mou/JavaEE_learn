package pers.quan.reviewannotation.test;

import pers.quan.reviewannotation.MyAnnotation;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TestReflectGetClass {



    public static void main(String[] args) {
//        通过反射来获取对象
         Map<String,Object> objMap = new HashMap();
        String packageName = "pers.quan.reviewannotation.bean";
        String path= packageName.replace(".", "/");

        URL url = ClassLoader.getSystemClassLoader().getResource(path);
        File file = new File(url.getPath());
        File[] files = file.listFiles();
        Arrays.stream(files).forEach(f -> {
            int index = f.getName().indexOf(".");
            String className = f.getName().substring(0,index);
            String fullClassName = packageName + "." + className;
            Class<?> aClass = null;
            try {
                aClass = Class.forName(fullClassName);
                if (aClass.isAnnotationPresent(MyAnnotation.class)) {
                    MyAnnotation annotation = aClass.getAnnotation(MyAnnotation.class);
                    String key = annotation.value();
                    Object obj = aClass.newInstance();
                    objMap.put(key,obj);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        });
        System.out.println(objMap);
    }
}
