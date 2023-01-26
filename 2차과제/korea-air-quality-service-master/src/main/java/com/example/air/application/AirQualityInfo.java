package com.example.air.application;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class AirQualityInfo {
    private String sido;
    private Double sidoPm10Avg;
    private String sidoPm10AvgGrade;
    private List<GuAirQualityInfo> guList;

    @Getter
    @Builder
    public static class GuAirQualityInfo {
        // TODO: 자치구 대기질 정보 명세서대로 파라미터 정의
        //private String area;
        private String gu;
        private Integer pm10;
        private Integer pm25;
        private Double o3;
        private Double no2;
        private Double co;
        private Double so2;
        private String pm10Grade;
        private String pm25Grade;
        private String o3Grade;
        private String no2Grade;
        private String coGrade;
        private String so2Grade;
    }
}
