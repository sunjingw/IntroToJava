package Chapter13.Chapter13_13;

import java.util.*;

public class Course implements Cloneable {

    private String courseName;
    private String[] students = new String[10];
    private int numberOfStudents;

    public Course() {

    }

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        String[] s = new String[10];

        for (int i = 0; i < getNumberOfStudents(); i++) {
            if (!students[i].equalsIgnoreCase(student)) {
                s[i] = students[i];
            }
        }
        this.students = s;
    }


    @Override
    public Object clone() {
        try {
            Course c = (Course)super.clone();
            c.students = students.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return c;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public String toString() {
        return "Course name: " + courseName + "\nStudent: " + Arrays.toString(getStudents());
    }
}
