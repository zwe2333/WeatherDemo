package com.example.weatherdemo.gson;

/**
 * Created by Asus on 2017/3/5.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
