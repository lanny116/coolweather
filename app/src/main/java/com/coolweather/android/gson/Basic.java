package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;
//返回数据
public class Basic {
    @SerializedName("city")//城市名
    public String cityName;
    @SerializedName("id")//城市对应的天气id
    public String weatherId;
    public Update update;
    public static class Update {
        @SerializedName("loc")//天气的更新时间
        public String updateTime;
    }

}
