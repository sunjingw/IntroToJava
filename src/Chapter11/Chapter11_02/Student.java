package Chapter11.Chapter11_02;

import java.util.Scanner;

public class Student extends Person {

    private String status;
    public final static String FRESHMAN = "Freshman";
    public final static String SOPHMORE = "Sophmore";
    public final static String JUNIOR = "Junior";
    public final static String SENIOR = "Senior";

    public Student(String name, String address, long phoneNumber, String email, String status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString() + "\nStatus: " + getStatus();
    }

}
