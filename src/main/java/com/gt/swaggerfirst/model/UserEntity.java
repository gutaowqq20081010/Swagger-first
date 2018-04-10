package com.gt.swaggerfirst.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "UserEntity", description = "密码登录user")
public class UserEntity {
    @ApiModelProperty(value = "username", dataType = "String")
    private String username;
    @ApiModelProperty(value = "password", dataType = "String")
    private String password;

    public UserEntity() {

    }

    public UserEntity(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
