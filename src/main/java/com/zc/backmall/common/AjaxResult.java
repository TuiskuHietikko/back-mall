package com.zc.backmall.common;

/**
 * Created by Administrator on 2017/5/15.
 */
public class AjaxResult {
    private Integer status;
    private String msg;
    private Object data;

    public AjaxResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public AjaxResult() {
        this.status = 200;
        this.setMsg("请求成功");
        this.setData(null);
    }
    public AjaxResult(Object data){
        this.status = 200;
        this.setMsg("请求成功");
        this.setData(data);
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public void setData(Object data) {
        this.data = data;
    }
}
