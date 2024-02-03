package Chapter20;

import java.util.*;

public class Ex20_21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        GeometricObject[] list = {new Circle(5), new Rectangle(4, 5), new Circle(5.5),
        new Rectangle(2.4, 5), new Circle(0.5), new Rectangle(4, 65), new Circle(4.5),
        new Rectangle(4.4, 1), new Circle(6.5), new Rectangle(4, 5)};


        for (GeometricObject e : list) {
            System.out.print(e.getArea() + " ");
        }

        GeometricObjectComparator comparator = new GeometricObjectComparator();

        selectionSort(list, comparator);

        System.out.println();

        for (GeometricObject e : list) {
            System.out.print(e.getArea() + " ");
        }
    }

    public static <E> void selectionSort(E[] list, Comparator<? super E> comparator) {

        for (int i = 0; i < list.length; i++) {
            E min = list[i];
            int index = i;

            for (int k = i; k < list.length; k++) {

                if (comparator.compare(min, list[k]) > 0) {
                    index = k;
                    min = list[k];
                }

            }

            if (index != i) {
                E temp = list[i];
                list[i] = min;
                list[index] = temp;
            }
        }


    }
}
