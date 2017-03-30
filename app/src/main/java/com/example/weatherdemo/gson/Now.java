package com.example.weatherdemo.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Asus on 2017/3/5.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
