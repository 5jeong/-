package com.example.air.application.util;

public class AirQualityGradeUtil {
    private AirQualityGradeUtil() {
    }

    //TODO: pm25 등급정보 구하는 함수
    public static String getPm25Grade(Double pm25) {
        if(pm25 >=0 && pm25<=15 ){
            return "좋음";
        }
        else if(pm25 > 15 && pm25<=35 ){
            return "보통";
        }
        else if(pm25 > 35 && pm25<=75 ){
            return "나쁨";
        }
        else if( pm25 > 75 ){
            return "매우 나쁨";
        }
        else{
            return "점검중";
        }
    }

    //TODO: pm10 등급정보 구하는 함수
    public static String getPm10Grade(Double pm10)
    {
        if(pm10 >=0 && pm10<=30 ){
            return "좋음";
        }
        else if(pm10 > 30 && pm10<=80 ){
            return "보통";
        }
        else if(pm10 > 80 && pm10<=150 ){
            return "나쁨";
        }
        else if( pm10 > 150 ){
            return "매우 나쁨";
        }
        else{
            return "점검중";
        }
    }

    //TODO: o3 등급정보 구하는 함수
    public static String getO3Grade(Double o3) {

        if(o3 >=0 && o3<=0.030 ){
            return "좋음";
        }
        else if(o3 >= 0.031 && o3<=0.090 ){
            return "보통";
        }
        else if(o3 >= 0.091  && o3<=0.150 ){
            return "나쁨";
        }
        else if( o3 >= 0.151 ){
            return "매우 나쁨";
        }
        else{
            return "점검중";
        }
    }

    //TODO: no2 등급정보 구하는 함수
    public static String getNo2Grade(Double no2) {

        if(no2 >=0 && no2<=0.030 ){
            return "좋음";
        }
        else if(no2 >= 0.031 && no2<=0.060 ){
            return "보통";
        }
        else if(no2 >= 0.061 && no2<=0.200 ){
            return "나쁨";
        }
        else if( no2 >= 0.201 ){
            return "매우 나쁨";
        }
        else{
            return "점검중";
        }
    }

    //TODO: co 등급정보 구하는 함수
    public static String getCoGrade(Double co) {

        if(co >=0 && co<=2 ){
            return "좋음";
        }
        else if(co >= 2.01 && co<=9 ){
            return "보통";
        }
        else if(co >= 9.01 && co<=15 ){
            return "나쁨";
        }
        else if( co >= 15.01 ){
            return "매우 나쁨";
        }
        else{
            return "점검중";
        }
    }

    //TODO: so2 등급정보 구하는 함수
    public static String getSo2Grade(Double so2) {

        if(so2 >=0 && so2<=0.020 ){
            return "좋음";
        }
        else if(so2 >= 0.021 && so2<=0.050 ){
            return "보통";
        }
        else if(so2 >= 0.051 && so2<=0.150 ){
            return "나쁨";
        }
        else if( so2 >= 0.151 ){
            return "매우 나쁨";
        }
        else{
            return "점검중";
        }
    }
}
