package com.liuyanzhao.sens.utils;

import lombok.Data;

/**
 * @author 言曌
 * @date 2019-05-22 22:02
 */

@Data
public class JsonResult {

    private Integer status;

    private String message;

    private String token;

    private Object data;

    public JsonResult() {
    }


    public JsonResult(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public JsonResult(Integer status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public JsonResult(Integer status, String message, String token, Object data) {
        this.status = status;
        this.message = message;
        this.token = token;
        this.data = data;
    }
}
