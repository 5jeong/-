package com.example.air.interfaces.api;

import com.example.air.application.AirQualityService;
import com.example.air.application.AirQualityInfo;
import com.example.air.application.Sido;
import com.example.air.infrastructure.api.busan.BusanAirQualityApiDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/air-quality")
public class AirQualityApiController {
    private final AirQualityService airQualityService;

    // TODO: 시도와 구정보를 parameter 로 받는 GET API 작성
    @GetMapping("/{sidoCode}")
    public AirQualityInfo getAirQualityInfo(@PathVariable("sidoCode") Sido sidoCode,
            @RequestParam(value = "gu",required = false) String gu) {
        return airQualityService.getAirQualityInfo(sidoCode,gu);
    }
}
