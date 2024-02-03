package Chapter11.Chapter11_02;

import Chapter10.MyDate;

import java.util.Scanner;

public class Faculty extends Employee {

    private double officeHours;
    private String rank;

    public Faculty(String name, String address, long phoneNumber, String email, boolean office, double salary, double officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public double getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(double officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String toString() {
        return super.toString() + "\noffice hours: " + getOfficeHours() + "\nrank: " + getRank();
    }
}
