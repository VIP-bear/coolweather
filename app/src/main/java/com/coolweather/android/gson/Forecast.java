package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {

    @SerializedName("date")
    public String date;

    @SerializedName("cond")
    public Mored mored;

    @SerializedName("tmp")
    public Temperature temperature;

    public class Mored{

        @SerializedName("txt_d")
        public String info;

    }

    public class Temperature{

        @SerializedName("max")
        public String max;

        @SerializedName("min")
        public String min;

    }

}
