package Chapter11;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Ex11_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Object> list = new ArrayList<>();


        list.add(new Date());
        list.add(new String("sdfdsfds"));
        list.add(new Circle());

        for (Object e : list) {
            System.out.println(e.toString());
        }

    }
}
