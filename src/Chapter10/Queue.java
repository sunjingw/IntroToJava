package Chapter10;

import java.util.Arrays;
import java.util.Scanner;

public class Queue {
    private int[] elements;
    private int size;
    public final int DEFAULT_CAPACITY = 8;

    public Queue() {
        elements = new int[DEFAULT_CAPACITY];
    }

    public void enqueue(int v) {

        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        elements[size] = v;
        size++;
    }

    public int dequeue() {

        int value = elements[0];
        int j = 0;
        for (int i = 1; i < elements.length; i++) {
            elements[j] = elements[i];
            j++;
        }

        size--;

        return value;
    }

    public boolean empty() {
        return size == 0;
    }
    public int getSize() {
        return size;
    }

    public String toString() {

        return Arrays.toString(elements);
    }
}
