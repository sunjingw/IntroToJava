package Chapter11.Chapter11_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Course {
    private String courseName;
    private ArrayList<String> students;
    private int numOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudents(String student) {

        students.add(student);
        numOfStudents++;

    }
    public void dropStudent(String student) {

        students.remove(student);
        numOfStudents--;
    }
    public ArrayList<String> getStudents() {
        return students;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }
    public String getCourseName() {
        return courseName;
    }
    public void clear() {
        students.clear();
        numOfStudents = 0;
    }

}
