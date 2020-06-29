package com.atustb.micro.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;
import java.util.Date;

@Data
@NoArgsConstructor
public class CurrentTime {

    private static Calendar cals = Calendar.getInstance();

    static {
        cals.setTime(new Date());
    }

    private String  currentYear =String.valueOf(cals.get(Calendar.YEAR));
    private String currentMonth=String.valueOf(cals.get(Calendar.MONTH));
    private String currentDayOfYear=String.valueOf(cals.get(Calendar.DAY_OF_WEEK));
    private String currentDayOfWeek=String.valueOf(cals.get(Calendar.DAY_OF_YEAR));

}
