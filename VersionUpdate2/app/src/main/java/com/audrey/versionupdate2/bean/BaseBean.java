package com.audrey.versionupdate2.bean;

/**
 * Created by 郭康杰 on 2017/11/29.
 */

public class BaseBean {

    /**
     * msg : 获取版本信息成功
     * code : 0
     * data : {"apkUrl":"https://www.zhaoapi.cn/version/200.apk","type":1,"vId":2,"versionCode":"200","versionName":"2.0"}
     */

    private String msg;
    private String code;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
