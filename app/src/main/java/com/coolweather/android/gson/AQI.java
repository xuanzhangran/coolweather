package com.coolweather.android.gson;

/**
 * Created by xuan on 2018/3/16.
 */

public class AQI {

    public AQICity city;

    private class AQICity {

        public String aqi;

        public String pm25;
    }
}
