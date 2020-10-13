package com.cy.service;

import com.cy.entity.UserEntity;

import java.util.List;

public interface UserService {

    List<UserEntity> findAllUser();

    UserEntity findUserById(Integer id);
}
