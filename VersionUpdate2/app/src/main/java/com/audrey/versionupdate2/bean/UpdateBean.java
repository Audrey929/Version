package com.audrey.versionupdate2.bean;

/**
 * Created by 郭康杰 on 2017/11/29.
 */

public class UpdateBean extends BaseBean {

    /**
     * data : {"apkUrl":"https://www.zhaoapi.cn/version/200.apk","type":1,"vId":2,"versionCode":"200","versionName":"2.0"}
     */

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * apkUrl : https://www.zhaoapi.cn/version/200.apk
         * type : 1
         * vId : 2
         * versionCode : 200
         * versionName : 2.0
         */

        private String apkUrl;
        private int type;
        private int vId;
        private String versionCode;
        private String versionName;

        public String getApkUrl() {
            return apkUrl;
        }

        public void setApkUrl(String apkUrl) {
            this.apkUrl = apkUrl;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getVId() {
            return vId;
        }

        public void setVId(int vId) {
            this.vId = vId;
        }

        public String getVersionCode() {
            return versionCode;
        }

        public void setVersionCode(String versionCode) {
            this.versionCode = versionCode;
        }

        public String getVersionName() {
            return versionName;
        }

        public void setVersionName(String versionName) {
            this.versionName = versionName;
        }
    }
}
