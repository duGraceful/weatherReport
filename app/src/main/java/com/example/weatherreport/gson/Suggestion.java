package com.example.weatherreport.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/9/17 0017.
 */

public class Suggestion {
    @SerializedName("comf")
    public CoMfort coMfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class CoMfort {

        @SerializedName("txt")
        public String info;
    }

    public class CarWash {

        @SerializedName("txt")
        public String info;
    }

    public class Sport {

        @SerializedName("txt")
        public String info;
    }
}
