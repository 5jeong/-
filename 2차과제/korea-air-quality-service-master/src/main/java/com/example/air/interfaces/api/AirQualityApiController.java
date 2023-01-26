package com.example.air.interfaces.api;

import com.example.air.application.AirQualityService;
import com.example.air.application.AirQualityInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AirQualityApiController {
    private final AirQualityService airQualityService;

    // TODO: 시도와 구정보를 parameter 로 받는 GET API 작성
    @GetMapping("/api/v1/air-quality/seoul")
    public AirQualityInfo getAirQualityInfo(@RequestParam(value = "gu",required = false) String gu) {
        return airQualityService.getAirQualityInfo(gu);
    }


}
