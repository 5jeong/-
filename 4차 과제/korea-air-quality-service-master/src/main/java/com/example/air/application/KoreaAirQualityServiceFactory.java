package com.example.air.application;

import com.example.air.infrastructure.api.busan.BusanAirQualityApiCaller;
import com.example.air.infrastructure.api.seoul.SeoulAirQualityApiCaller;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Component
//@RequiredArgsConstructor
public class KoreaAirQualityServiceFactory {
    private final Map<Sido,KoreaAirQualityService> serviceMap = new HashMap<>();
    public KoreaAirQualityServiceFactory(List<KoreaAirQualityService> services){
        for(KoreaAirQualityService s : services){
            serviceMap.put(s.getSido(),s);
        }
    }

//    private final SeoulAirQualityApiCaller seoulAirQualityApiCaller;
//    private final BusanAirQualityApiCaller busanAirQualityApiCaller;
//
//    public KoreaAirQualityService getService(Sido sido) {
//
//        if (sido == Sido.seoul) {
//            return seoulAirQualityApiCaller;
//        }
//        if (sido == Sido.busan) {
//            return busanAirQualityApiCaller;
//        }
//        new RuntimeException("대기질 정보를 조회할 수 없는 시/도 입니다.");
//        return null;
//    }

    public KoreaAirQualityService getService(Sido sido){
        System.out.println(serviceMap.get(sido));
        return Optional.of(serviceMap.get(sido))
                .orElseThrow(()-> new RuntimeException("대기질 정보를 조회할 수 없는 시,도입니다.!"));
    }
}
