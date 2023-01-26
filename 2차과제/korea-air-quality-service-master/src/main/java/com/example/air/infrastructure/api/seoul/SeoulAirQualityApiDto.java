package com.example.air.infrastructure.api.seoul;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Objects;

public class SeoulAirQualityApiDto {
    @Getter
    @Setter
    @ToString
    public static class GetAirQualityResponse {
        // @JsonProperty는 파라미터를 내가 원하는 변수명으로 맵핑하고 싶은 경우 사용
        // RealtimeCityAir -> response
        @JsonProperty("RealtimeCityAir")
        private Response response;
    }

    @Getter
    @Setter
    @ToString
    public static class Response {
        @JsonProperty("RESULT")
        private Result result;
        @JsonProperty("row")
        private List<Row> rows;

        public boolean isSuccess() {
            if (Objects.equals(result.getCode(), "INFO-000")) {
                return true;
            }
            return false;
        }
    }

    @Getter
    @Setter
    @ToString
    public static class Result {
        @JsonProperty("CODE")
        private String code;
        @JsonProperty("MESSAGE")
        private String message;
    }

    @Getter
    @Setter
    @ToString
    public static class Row {
        @JsonProperty("MSRRGN_NM")
        private String area;
        @JsonProperty("MSRSTE_NM")
        private String site;
        @JsonProperty("MSRDT_DE")
        private String measurementTime;
        @JsonProperty("SO2")
        private Double so2;
        @JsonProperty("NO2")
        private Double no2;
        @JsonProperty("O3")
        private Double o3;
        @JsonProperty("CO")
        private Double co;
        @JsonProperty("PM25")
        private Integer pm25;
        @JsonProperty("PM10")
        private Integer pm10;
    }
}
