package Chapter10;

import java.util.Date;
import java.util.Scanner;

public class MyDate {
    private int year;
    private int month;
    private int day;
    private MyDate date;

    public MyDate() {
        //date = new NTU.Edu.MyDate();
        year = 2023;
        month = 9;
        day = 10;
    }

    public MyDate(long ms) {
        Date d = new Date(ms);
        year = d.getYear();
        month = d.getMonth();
        day = d.getDate();
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
    public void setDate(long elapsedTime) {
        Date d = new Date(elapsedTime);
        date.year = d.getYear();
        date.month = d.getMonth();
        date.day = d.getDate();
    }
}
