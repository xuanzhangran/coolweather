package com.coolweather.android.util;

/**
 * Created by xuan on 2018/3/6.
 */

public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
