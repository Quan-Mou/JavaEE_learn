package pers.quan.spring.dao;

import pers.quan.spring.bean.User;

import java.util.List;

public interface UserDao {

//    添加一条数据
    int insert(User user);

//    修改
    int modify(User user,Integer id);

//    删除
    int delete(Integer id);

//    查一条记录
    User selectById(Integer id);

//    查询所有记录
    List<User> selectAll();

//    查询所有记录条数
    int selectCount();






}
