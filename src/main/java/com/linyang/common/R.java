package com.linyang.common;

/**
 * @authhor linyang
 * @data 2019-01-24 - 21:24
 */


public class R {
    private Integer code;

    private  String msg;

    private Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public R setData(Object data) {
        this.data = data;
        return this;
    }

    public static R ok() {
        R r = new R();
        r.setCode(0);
        r.setMsg("操作成功");
        return r;
    }
}
