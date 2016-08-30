package com.coolweather.app.util;

/**
 * Created by archur on 2016/8/30.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
