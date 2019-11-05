package com.calendar.supportMan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class SupportMan {
    public String name;
    public String surname;
    public int normalHours;
    public int holidayHours;
    public List<Integer> daysOfMonthList;
}
