package Chapter10;

import java.util.Scanner;

public class Course {
    private String courseName;
    private String[] students = new String[2];
    private int numOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudents(String student) {

        if (numOfStudents >= students.length) {
            String[] temp = new String[students.length + 1];
            System.arraycopy(students,0, temp, 0, students.length);
            students = temp;
        }

        students[numOfStudents] = student;
        numOfStudents++;

    }
    public void dropStudent(String student) {
        int index = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(student)) {
                index = i;
            }
        }

        String[] s = new String[numOfStudents - 1];
        int j = 0;
        for (int i = 0; i < students.length; i++) {
            if (i == index) {
                continue;
            } else {
                s[j] = students[i];
                j++;
            }
        }

        students = s;
        numOfStudents--;
    }
    public String[] getStudents() {
        return students;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }
    public String getCourseName() {
        return courseName;
    }
    public void clear() {
        students = new String[0];
        numOfStudents = 0;
    }

}
