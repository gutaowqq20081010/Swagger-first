package com.gt.swaggerfirst.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="UserResponseEntity",description = "用户模块response")
public class UserResponseEntity{
    @ApiModelProperty(value="详细数据实体")
    private UserInfoEntity userInfoEntity;

    public UserInfoEntity getUserInfoEntity() {
        return userInfoEntity;
    }

    public void setUserInfoEntity(UserInfoEntity userInfoEntity) {
        this.userInfoEntity = userInfoEntity;
    }
}
