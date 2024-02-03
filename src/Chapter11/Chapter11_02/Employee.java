package Chapter11.Chapter11_02;


import Chapter10.MyDate;
import java.util.Scanner;

public class Employee extends Person {

    private boolean office;
    private double salary;
    private MyDate hired;

    public Employee(String name, String address, long phoneNumber, String email, boolean office, double salary) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.hired = new MyDate();
    }

    public boolean isOffice() {
        return office;
    }

    public void setOffice(boolean office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getHired() {
        return hired;
    }

    public void setHired(MyDate hired) {
        this.hired = hired;
    }


    public String toString() {
        return super.toString() + "\noffice: " + isOffice() + "\nsalary: " + getSalary() + "\nhired: " + getHired().getYear() + "-" + getHired().getMonth() + "-" + getHired().getDay();
    }
}
