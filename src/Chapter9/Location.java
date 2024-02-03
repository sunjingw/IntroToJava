package Chapter9;

import java.util.Scanner;

public class Location {
    public int row;
    public int column;
    public double maxValue;


    public Location() {

    }

    public static Location locateLargest(double[][] a) {
        Location l = new Location();
        l.maxValue = a[0][0];

        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                if (a[row][col] > l.maxValue) {
                    l.maxValue = a[row][col];
                    l.row = row;
                    l.column = col;
                }
            }
        }

        return l;
    }
}
