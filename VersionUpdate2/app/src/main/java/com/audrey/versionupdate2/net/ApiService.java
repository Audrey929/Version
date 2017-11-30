package com.audrey.versionupdate2.net;

import com.audrey.versionupdate2.bean.UpdateBean;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by 郭康杰 on 2017/11/3.
 */

public interface ApiService {

    //注册
    @POST("getVersion")
    @FormUrlEncoded
    Observable<UpdateBean> getRegisterCode(@Field("type") String type);

/*    //首页获取信息
    @GET("ad/{name}")
    Observable<PagerBean> getHomePager(@Path("name") String name);*/

}
