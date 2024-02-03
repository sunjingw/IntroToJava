package Chapter11.Chapter11_10;

import java.util.*;

public class Ex11_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        MyStack m = new MyStack();

        m.push("aaaa");
        m.push("bbbb");
        m.push("cccc");

        System.out.println(m.pop());
        System.out.println(m.pop());
        System.out.println(m.pop());
    }
}
