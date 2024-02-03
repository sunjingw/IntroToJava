package Chapter11.Chapter11_02;

import java.util.Scanner;

public class Ex11_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Person p1 = new Person("aa","bb",123123,"aa@bb.com");
        Student s1 = new Student("bb","cc",3242234,"dd@sddf.com",Student.JUNIOR);
        Employee e1 = new Employee("cc", "dd", 252532, "easdfd@sdf.com", true, 353.3);
        Faculty f1 = new Faculty("aa","bb",2352353,"sfsd@sdfd.com",true,3233.3,535.35, "CEO");
        Staff st1 = new Staff("sss","ddd",52353,"sfsd@sdfd.com",false,3235.35,"CFO");

        System.out.println(p1.toString());
        System.out.println(s1.toString());
        System.out.println(e1.toString());
        System.out.println(f1.toString());
        System.out.println(st1.toString());
    }
}
