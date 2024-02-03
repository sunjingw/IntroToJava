package Chapter11.Chapter11_02;

import Chapter10.MyDate;

import java.util.Scanner;

public class Staff extends Employee {

    private String title;

    public Staff(String name, String address, long phoneNumber, String email, boolean office, double salary, String title) {
        super(name, address, phoneNumber, email, office, salary);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String toString() {
        return super.toString() + "\ntitle: " + getTitle();
    }
}
