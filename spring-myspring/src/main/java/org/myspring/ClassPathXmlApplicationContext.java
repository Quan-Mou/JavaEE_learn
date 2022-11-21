package org.myspring;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassPathXmlApplicationContext implements ApplicationContext {

    private Map<String,Object> mapBean = new HashMap<>();

    public ClassPathXmlApplicationContext(String configName) {

        SAXReader saxReader = new SAXReader();
        try {
            Document read = saxReader.read(ClassLoader.getSystemResourceAsStream(configName));
            List<Node> beans = read.selectNodes("//bean");

            beans.forEach(bean -> {
                Element ele = (Element) bean;
                String name = ele.attributeValue("id");
                String className = ele.attributeValue("class");
//                获取到对象先曝光
                try {
                    Class<?> aClass = Class.forName(className);
                    Object objBean = aClass.newInstance();
                    mapBean.put(name,objBean);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

            });
//            获取Bean里面的属性
            beans.forEach(bean -> {
                Element ele = (Element) bean;
                String beanName = ele.attributeValue("id");
//               获取Bean下的property属性
                List<Element> propertyNode = ele.elements("property");
                String className = ele.attributeValue("class");
                    propertyNode.forEach(propertys -> {
                        String propertyName = propertys.attributeValue("name");
                        String value = propertys.attributeValue("value");
                        String ref = propertys.attributeValue("ref");
                        String methodName = "set" + propertyName.toUpperCase().charAt(0) + propertyName.substring(1); // 方法名

                        try {
                            Field field = mapBean.get(beanName).getClass().getDeclaredField(propertyName);
                            Method method = mapBean.get(beanName).getClass().getDeclaredMethod(methodName, field.getType());
                            Object propertyVal = null;
                            if (value != null) {
                                String simpleName = field.getType().getSimpleName();
                                switch (simpleName) {
                                    case "byte": case "Byte":
                                        propertyVal = Byte.valueOf(value);
                                        break;
                                    case "short": case "Short":
                                        propertyVal = Short.valueOf(value);
                                        break;
                                    case "int": case "Integer":
                                        propertyVal = Integer.valueOf(value);
                                        break;
                                    case "long": case "Long":
                                        propertyVal = Long.valueOf(value);
                                        break;
                                    case "float": case "Float":
                                        propertyVal = Float.valueOf(value);
                                        break;
                                    case "double": case "Double":
                                        propertyVal = Double.valueOf(value);
                                        break;
                                    case "boolean": case "Boolean":
                                        propertyVal = Boolean.valueOf(value);
                                        break;
                                    case "char": case "Character":
                                        propertyVal = value.charAt(0);
                                        break;
                                    case "String":
                                        propertyVal = value;
                                        break;
                                }
                                method.invoke(mapBean.get(beanName),propertyVal);
                            }
                            if (ref != null) {
                                method.invoke(mapBean.get(beanName),mapBean.get(ref));
                            }
                        } catch (NoSuchFieldException | NoSuchMethodException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }

                    });

            });

        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object getBean(String beanName) throws DocumentException {
        return mapBean.get(beanName);
    }
}
