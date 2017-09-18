package com.example.weatherreport.gson;

/**
 * Created by Administrator on 2017/9/17 0017.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
