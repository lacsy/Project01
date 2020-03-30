package com.it.dao;

import com.it.damain.User;

import java.util.List;

public interface IUserDao {
    /**
     * 查询所有操作
     */
    List<User> findAll();

}
