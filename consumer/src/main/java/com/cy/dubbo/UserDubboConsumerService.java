package com.cy.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cy.entity.UserEntity;
import com.cy.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDubboConsumerService {
    @Reference
    UserService userService;

    public void printUser(){
        List<UserEntity> userList = userService.findAllUser();
        for (UserEntity userEntity : userList) {
            System.out.println(userEntity);
        }
    }
}
