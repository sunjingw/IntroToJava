package Chapter4;

import java.util.Scanner;

public class Ex4_02 {
    public static void main(String[] args) {

        //Geometry - great circle distance
        Scanner input = new Scanner(System.in);

        System.out.println("Enter point 1 (latitude and longitude): ");
        String lonLat1 = input.nextLine();
        double x1 = Math.toRadians(Double.parseDouble(lonLat1.substring(0, lonLat1.indexOf(','))));
        double y1 = Math.toRadians(Double.parseDouble(lonLat1.substring(lonLat1.indexOf(',')+2)));


        System.out.println("Enter point 2 (latitude and longitude): ");
        String lonLat2 = input.nextLine();
        double x2 = Math.toRadians(Double.parseDouble(lonLat2.substring(0, lonLat2.indexOf(','))));
        double y2 = Math.toRadians(Double.parseDouble(lonLat2.substring(lonLat2.indexOf(',')+2)));


        double d = 6371.01 * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        System.out.println("The distance between the two points is " + d + " km");
    }
}
