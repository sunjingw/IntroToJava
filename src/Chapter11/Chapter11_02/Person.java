package Chapter11.Chapter11_02;

import java.util.Scanner;

public class Person {
    private String name;
    private String address;
    private long phoneNumber;
    private String email;


    public Person(String name, String address, long phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Person(String peter) {
        name = peter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "name: " + getName() + "\naddress: " + getAddress() + " \nphone: " + getPhoneNumber() + "\nemail: " + getEmail();
    }

}
