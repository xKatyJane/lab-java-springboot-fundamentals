package com.ironhack.SpringBootFundamentals.time;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Map;


@RestController
public class TimeController {
    public TimeController (TimeService timeService) {
        this.timeService = timeService;
    }
    private final TimeService timeService;

    @GetMapping("/time")
    public LocalTime showCurrentTime() {
        return timeService.showCurrentTime();
    }

    @GetMapping("/date")
    public LocalDate showCurrentDate() {
        return timeService.showCurrentDate();
    }

    @GetMapping("/day")
    public DayOfWeek showCurrentDayOfWeek() {
        return timeService.showCurrentDayOfWeek();
    }

    @GetMapping("/time/all")
    public Map<String, Object> getTimeData() {
        return timeService.getTimeData();
    }
}
