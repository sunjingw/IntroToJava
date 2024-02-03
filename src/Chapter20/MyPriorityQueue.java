package Chapter20;

import java.util.*;

public class MyPriorityQueue<E> extends PriorityQueue<E> implements Cloneable {

    PriorityQueue<E> list;

    public MyPriorityQueue() {
        this.list = new PriorityQueue<>();
    }
    @Override
    public MyPriorityQueue<E> clone() {
        try {
            return (MyPriorityQueue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
