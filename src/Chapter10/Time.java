package Chapter10;

import java.util.Scanner;
import java.util.*;

public class Time {
    private long hour;
    private long minute;
    private long second;

    public Time() {
        Date date = new Date();
        hour = date.getHours();
        minute = date.getMinutes();
        second = date.getSeconds();
    }

    public Time(long elapse) {
        setTime(elapse);
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public long getMinute() {
        return minute;
    }
    public long getSecond() {
        return second;
    }
    public void setTime(long elapseTime) {
        hour = elapseTime / 1000 / 60 / 60 % 24;
        minute = elapseTime / 1000 / 60 % 60;
        second = elapseTime / 1000 % 60;
    }

    public long getHour() {
        return hour;
    }
}
