package com.melt.spring.boot.helloword.dao;

import com.melt.spring.boot.helloword.entity.User;

/**
 * @author melt
 * @create 2018/4/9 17:03
 */
public interface UserDao {

    int insert(User record);

    User selectByPrimaryKey(Integer id);
}
