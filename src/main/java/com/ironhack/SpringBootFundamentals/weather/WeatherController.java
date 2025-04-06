package com.ironhack.SpringBootFundamentals.weather;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class WeatherController {
    public WeatherController (WeatherService weatherService) {
        this.weatherService = weatherService;
    }
    private final WeatherService weatherService;

    @GetMapping("/weather/all")
    public Map<String, Object> getWeatherInfo() {
        return weatherService.getWeatherInfo();
    }

    @GetMapping("/weather/temperature")
    public Map<String, Object> getTemperature() {
        Map<String, Object> temperatureInfo = getWeatherInfo();
        Map<String, Object> filteredTemperature = new HashMap<>();
        if (temperatureInfo.containsKey("Temperature (°C)")) {
            filteredTemperature.put("Temperature (°C)", temperatureInfo.get("Temperature (°C)"));
        }
        return filteredTemperature;
    }

    @GetMapping("weather/condition")
    public Map<String, Object> getCondition() {
        Map<String, Object> conditionInfo = getWeatherInfo();
        Map<String, Object> filteredCondition = new HashMap<>();
        if (conditionInfo.containsKey("Weather Description")) {
            filteredCondition.put("Weather Description", conditionInfo.get("Weather Description"));
        }
        return filteredCondition;
    }

    @GetMapping("weather/wind")
    public Map<String, Object> getWindSpeed() {
        Map<String, Object> windSpeedInfo = getWeatherInfo();
        Map<String, Object> filteredWindSpeed = new HashMap<>();
        if (windSpeedInfo.containsKey("Wind Speed (km/h)")) {
            filteredWindSpeed.put("Wind Speed (km/h)", windSpeedInfo.get("Wind Speed (km/h)"));
        }
        return filteredWindSpeed;
    }
}