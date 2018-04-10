package com.gt.swaggerfirst.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "ResponseResult", description = "统一回复")
public class ResponseResult<T> implements Serializable {
    @ApiModelProperty(value = "返回码")
    private int code;
    @ApiModelProperty(value = "业务说明")
    private String message;
    @ApiModelProperty(value = "业务实体类")
    private T body;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
