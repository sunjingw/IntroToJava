package Chapter19;

import java.util.*;

public class Ex19_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        GenericStack<String> list = new GenericStack<>();

        for (int i = 0; i < 5; i++) {
            list.add(input.nextLine());
        }

        System.out.println(list.getSize());
        System.out.println(list.peek());
        System.out.println(list.pop());

        System.out.println(list);
    }

    static class GenericStack<E> extends ArrayList<E> {

        public int getSize() {
            return size();
        }

        public E peek() {
            return get(getSize() - 1);
        }

        public void push (E o) {
            add(o);
        }

        public E pop() {
            E o = get(getSize() - 1);
            remove(o);
            return o;
        }

        public boolean isEmpty() {
            return isEmpty();
        }

        @Override
        public String toString() {
            return "stack: " + Arrays.toString(this.toArray());
        }
    }
}
