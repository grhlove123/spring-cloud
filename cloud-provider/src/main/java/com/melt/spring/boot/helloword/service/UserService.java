package com.melt.spring.boot.helloword.service;

import com.melt.spring.boot.helloword.entity.User;

/**
 * @author melt
 * @create 2018/4/9 17:14
 */
public interface UserService {

    User getUserById(int userId);

    boolean addUser(User record);
}
