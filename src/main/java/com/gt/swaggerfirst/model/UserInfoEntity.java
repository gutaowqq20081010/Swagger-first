package com.gt.swaggerfirst.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="UserInfoEntity", description = "用户信息")
public class UserInfoEntity {
    @ApiModelProperty(value="用户名")
    private String username;
    @ApiModelProperty(value="昵称")
    private String nickname;
    @ApiModelProperty(value="邮箱")
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
