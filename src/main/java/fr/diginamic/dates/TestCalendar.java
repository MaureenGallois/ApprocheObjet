package fr.diginamic.dates;

import java.util.Calendar;
import java.util.Date;

public class TestCalendar {
    public static void main(String[] args) {
        Date aujourdhui = new Date();
        Date newDate = new Date(116,04,19,23,59,30);

        Calendar calendar = Calendar.getInstance();
        Calendar newCalendar = Calendar.getInstance();

        calendar.setTime(aujourdhui);
        newCalendar.setTime(newDate);

        System.out.println(calendar.get(calendar.DAY_OF_MONTH)+"/"+calendar.get(calendar.MONTH)+"/"+calendar.get(calendar.YEAR));
        System.out.println(newCalendar.get(newCalendar.YEAR)+"/"+newCalendar.get(newCalendar.MONTH)+"/"+newCalendar.get(newCalendar.DAY_OF_MONTH)+" "+newCalendar.get(newCalendar.HOUR)+":"+newCalendar.get(newCalendar.MINUTE)+":"+newCalendar.get(newCalendar.SECOND));
    }
}
