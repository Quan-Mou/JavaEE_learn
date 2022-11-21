package pers.quan.spring.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class QingDaYe {

//    注入数组
    private String[] names; // 简单数据数组
    private Person[] persons; // 复杂数据数组
    private List<String> friend; // 注入List
    private Set<String> fruits; // 注入set 无序不重复
    private Map<Integer,String> mapNum; // 注入Map
    private String emptyStr; // 注入空字符
    private String emptyNull; // 注入null，不注入就默认是null
    private String specialChar; // 注入特殊字符

    public void setSpecialChar(String specialChar) {
        this.specialChar = specialChar;
    }

    @Override
    public String toString() {
        return "QingDaYe{" +
                "names=" + Arrays.toString(names) +
                ", persons=" + Arrays.toString(persons) +
                ", friend=" + friend +
                ", fruits=" + fruits +
                ", mapNum=" + mapNum +
                ", emptyStr='" + emptyStr + '\'' +
                ", emptyNull='" + emptyNull + '\'' +
                ", specialChar='" + specialChar + '\'' +
                '}';
    }

    public void setEmptyStr(String emptyStr) {
        this.emptyStr = emptyStr;
    }

    public void setEmptyNull(String emptyNull) {
        this.emptyNull = emptyNull;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    public void setFriend(List<String> friend) {
        this.friend = friend;
    }

    public void setFruits(Set<String> fruits) {
        this.fruits = fruits;
    }

    public void setMapNum(Map<Integer, String> mapNum) {
        this.mapNum = mapNum;
    }

}
