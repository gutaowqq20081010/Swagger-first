package com.gt.swaggerfirst.controller;


import com.gt.swaggerfirst.model.ResponseResult;
import com.gt.swaggerfirst.model.UserEntity;
import com.gt.swaggerfirst.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
@Api(value = "/user", description = "User 相关操作")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ApiOperation(value = "/login", notes = "用户密码登录")
    @ApiImplicitParams({@ApiImplicitParam(name = "username", value = "18888888888", required = true),
            @ApiImplicitParam(name = "password", value = "88888888", required = true)})
    @ApiResponses({@ApiResponse(code = 1000, message = "成功返回码", response = ResponseResult.class),
            @ApiResponse(code = 0, message = "失败返回码", response = ResponseResult.class)})
    public ResponseResult loginByPass(@RequestBody UserEntity userEntity) {
        ResponseResult responseResult = userService.login(userEntity.getUsername(), userEntity.getPassword());
        return responseResult;
    }
}

