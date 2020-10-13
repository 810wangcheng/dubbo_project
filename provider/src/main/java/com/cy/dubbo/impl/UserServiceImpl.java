package com.cy.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cy.dao.UserRepository;
import com.cy.entity.UserEntity;
import com.cy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserEntity> findAllUser() {
        List<UserEntity> userList = userRepository.findAll();
        return userList;
    }

    @Override
    public UserEntity findUserById(Integer id) {
        return null;
    }
}
