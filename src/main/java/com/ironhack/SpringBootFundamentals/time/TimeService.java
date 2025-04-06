package com.ironhack.SpringBootFundamentals.time;

import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

@Service
public class TimeService {

    public LocalTime showCurrentTime () {
        LocalTime currentTime = LocalTime.now();
        return currentTime;
    }

    public LocalDate showCurrentDate () {
        LocalDate currentDate = LocalDate.now();
        return currentDate;
    }

    public DayOfWeek showCurrentDayOfWeek () {
        DayOfWeek currentDayOfWeek = LocalDate.now().getDayOfWeek();
        return currentDayOfWeek;
    }

    public Map<String, Object> getTimeData() {
        Map<String, Object> timeInfo = new HashMap<>();
        timeInfo.put("Current time", showCurrentTime());
        timeInfo.put("Current date", showCurrentDate());
        timeInfo.put("Current day of the week", showCurrentDayOfWeek());
        return timeInfo;
    }

}
