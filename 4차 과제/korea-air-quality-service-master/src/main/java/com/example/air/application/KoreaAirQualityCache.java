package com.example.air.application;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class KoreaAirQualityCache {
    private final KoreaAirQualityServiceFactory koreaAirQualityServiceFactory;
//    LocalTime now = LocalTime.now();
//    int hour = now.getHour();
    @Cacheable(value = "AirQualityInfo",key = "#sido")
    public AirQualityInfo getCache(Sido sido){
        System.out.println("캐시 부름");
        KoreaAirQualityService koreaAirQualityService = koreaAirQualityServiceFactory.getService(sido);

        return koreaAirQualityService.getAirQuality();
    }
    @CachePut(value = "AirQuality",key = "#sido")
    public AirQualityInfo updateCache(Sido sido){
        System.out.println("캐시 업데이트");
        KoreaAirQualityService koreaAirQualityService = koreaAirQualityServiceFactory.getService(sido);

        return koreaAirQualityService.getAirQuality();
    }
}
