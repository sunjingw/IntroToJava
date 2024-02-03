package Chapter10;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Course course = new Course("ABC 101");

        System.out.println(course.getCourseName());
        System.out.println(course.getNumOfStudents());
        System.out.println(Arrays.toString(course.getStudents()));

        course.addStudents("John");
        course.addStudents("Smith");
        course.addStudents("Minny");

        System.out.println(course.getCourseName());
        System.out.println(course.getNumOfStudents());
        System.out.println(Arrays.toString(course.getStudents()));

        course.dropStudent("Smith");
        System.out.println(course.getCourseName());
        System.out.println(course.getNumOfStudents());
        System.out.println(Arrays.toString(course.getStudents()));

        course.clear();
        System.out.println(course.getCourseName());
        System.out.println(course.getNumOfStudents());
        System.out.println(Arrays.toString(course.getStudents()));
    }
}
