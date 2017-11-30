package com.audrey.versionupdate2.presenter;

import android.content.Context;

import com.audrey.versionupdate2.bean.BaseBean;
import com.audrey.versionupdate2.bean.UpdateBean;
import com.audrey.versionupdate2.model.UpdateModel;
import com.audrey.versionupdate2.net.OnNetListener;
import com.audrey.versionupdate2.view.UpdateView;

/**
 * Created by dell on 2017/11/30.
 */
public class UpdatePresenter {
    private Context context;
    private UpdateView updateView;
    private UpdateModel updateModel;

    public UpdatePresenter(UpdateView updateView) {
        this.context = (Context) updateView;
        this.updateView = updateView;
        this.updateModel = new UpdateModel(context);
    }

    public void getAddressRecycleGson(String type) {
        updateModel.getAddress(type, new OnNetListener() {
            @Override
            public void setOnNetListener(BaseBean baseBean) {
                updateView.update((UpdateBean) baseBean);
            }
        });
    }
}

