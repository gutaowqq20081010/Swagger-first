package com.gt.swaggerfirst.service.impl;

import com.gt.swaggerfirst.model.ResponseResult;
import com.gt.swaggerfirst.model.UserInfoEntity;
import com.gt.swaggerfirst.model.UserResponseEntity;
import com.gt.swaggerfirst.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public ResponseResult login(String username, String pass) {
        ResponseResult entity = new ResponseResult();
        if ("18888888888".equals(username) && "88888888".equals(pass)) {
            entity.setCode(1000);
            entity.setMessage("登录成功");
            UserInfoEntity infoEntity = new UserInfoEntity();
            infoEntity.setEmail("341315@163.com");
            infoEntity.setNickname("GT");
            infoEntity.setUsername(username);
            entity.setBody(infoEntity);
        } else {
            entity.setCode(1001);
            entity.setMessage("登录失败");
            entity.setBody(null);
        }
        return entity;
    }
}
