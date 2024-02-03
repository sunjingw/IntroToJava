package Chapter13.Chapter13_13;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Course c1 = new Course("Science");
        c1.addStudent("john");
        c1.addStudent("sam");
        c1.addStudent("terry");

        System.out.println(c1.toString());

        Course c2 = (Course)c1.clone();

        c1.dropStudent("sam");
        System.out.println(c1.toString());
        System.out.println(c2.toString());

    }
}
