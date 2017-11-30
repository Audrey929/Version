package com.audrey.versionupdate2.model;

import android.content.Context;

import com.audrey.versionupdate2.bean.UpdateBean;
import com.audrey.versionupdate2.net.Api;
import com.audrey.versionupdate2.net.ApiService;
import com.audrey.versionupdate2.net.OnNetListener;
import com.audrey.versionupdate2.net.RetrofitUtils;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by dell on 2017/11/30.
 */

public class UpdateModel {

    private Context context;

    public UpdateModel(Context context) {
        this.context = context;
    }

    public void getAddress(String type , final OnNetListener onNetListener){
        Observable<UpdateBean> observable = RetrofitUtils.getInstance(context).getApiService(Api.HTTPS, ApiService.class).getRegisterCode(type);
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<UpdateBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(UpdateBean updateBean) {
                       onNetListener.setOnNetListener(updateBean);
                    }
                });
    }
}
