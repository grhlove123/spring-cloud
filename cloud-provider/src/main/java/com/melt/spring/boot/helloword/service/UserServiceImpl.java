package com.melt.spring.boot.helloword.service;

import com.melt.spring.boot.helloword.dao.UserDao;
import com.melt.spring.boot.helloword.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author melt
 * @create 2018/4/9 17:15
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User getUserById(int userId) {
        return userDao.selectByPrimaryKey(userId);
    }

    @Override
    public boolean addUser(User record) {
        return false;
    }
}
