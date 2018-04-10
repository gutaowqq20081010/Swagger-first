package com.gt.swaggerfirst.service;

import com.gt.swaggerfirst.model.ResponseResult;
import com.gt.swaggerfirst.model.UserInfoEntity;
import com.gt.swaggerfirst.model.UserResponseEntity;

public interface UserService {

    ResponseResult login(String username, String password);
}
