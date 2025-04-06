package com.ironhack.SpringBootFundamentals.weather;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.*;

@Service
public class WeatherService {

    public String getTemperature() {
        Random rand = new Random();
        double temperature = rand.nextDouble(40 - 10 +1);
        String temperatureRounded = String.format("%.2f", temperature);
        return temperatureRounded;
    }

    public String getWeatherDescription() {
        List<String> weatherDescriptions = new ArrayList<>();
        weatherDescriptions.add("Sunny");
        weatherDescriptions.add("Rainy");
        weatherDescriptions.add("Cloudy");
        weatherDescriptions.add("Windy");
        Random rand = new Random();
        int randomIndex = rand.nextInt(weatherDescriptions.size());
        String weatherDescription = weatherDescriptions.get(randomIndex);
        return weatherDescription;
    }

    public int getWindSpeed() {
        Random rand = new Random();
        int windSpeed = rand.nextInt(100);
        return windSpeed;
    }

    public Map<String, Object> getWeatherInfo() {
        Map<String, Object> weatherInfo = new HashMap<>();
        weatherInfo.put("Temperature (°C)", getTemperature());
        weatherInfo.put("Weather Description", getWeatherDescription());
        weatherInfo.put("Wind Speed (km/h)", getWindSpeed());
        return weatherInfo;
    }
}