package com.example.air.application;

import com.example.air.infrastructure.api.seoul.SeoulAirQualityApiCaller;
import com.example.air.infrastructure.api.seoul.SeoulAirQualityApiDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class AirQualityService {
    private final SeoulAirQualityApiCaller seoulAirQualityApiCaller;

    public AirQualityInfo getAirQualityInfo(String gu) {
        AirQualityInfo airQualityInfo = seoulAirQualityApiCaller.getAirQuality();

        // TODO: 자치구 검색 로직 추가 (시간 남는 경우)
        for(AirQualityInfo.GuAirQualityInfo x : airQualityInfo.getGuList()){
            if(x.getGu().equals(gu)){
                ArrayList<AirQualityInfo.GuAirQualityInfo> guInfo = new ArrayList<>();
                guInfo.add(AirQualityInfo.GuAirQualityInfo.builder()
                        .gu(x.getGu())
                        .pm10(x.getPm10())
                        .pm25(x.getPm25())
                        .o3(x.getO3())
                        .no2(x.getNo2())
                        .co(x.getCo())
                        .so2(x.getSo2())
                        .pm10Grade(x.getPm10Grade())
                        .pm25Grade(x.getPm25Grade())
                        .o3Grade(x.getO3Grade())
                        .no2Grade(x.getNo2Grade())
                        .coGrade(x.getCoGrade())
                        .so2Grade(x.getSo2Grade())
                        .build());

                AirQualityInfo airQualityInfo2 = AirQualityInfo.builder()
                        .sido("서울시")
                        .sidoPm10Avg(airQualityInfo.getSidoPm10Avg())
                        .sidoPm10AvgGrade(airQualityInfo.getSidoPm10AvgGrade())
                        .guList(guInfo)
                        .build();

                return airQualityInfo2;
            }
        }
        return airQualityInfo;
    }

}
