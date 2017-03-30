package com.example.weatherdemo.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Asus on 2017/3/5.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
