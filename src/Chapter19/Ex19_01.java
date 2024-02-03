package Chapter19;

import java.util.*;

public class Ex19_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        GenericStack<String> stack1 = new GenericStack<>();
        stack1.push("Atlanta");
        stack1.push("Memphis");
        stack1.push("New York");
        stack1.push("Columbus");
        stack1.push("Chicago");
        stack1.push("St. Louis");
        stack1.push("New Orleans");
        stack1.push("St. Louis");
        stack1.push("New Orleans");
        stack1.push("New York");
        stack1.push("Columbus");
        stack1.push("Chicago");
        stack1.push("St. Louis");
        stack1.push("New Orleans");
        stack1.push("St. Louis");
        stack1.push("New Orleans");
        stack1.push("New York");
        stack1.push("Columbus");
        stack1.push("Chicago");

        System.out.println(stack1.getSize());
        System.out.println(stack1.peek());
        System.out.println(stack1.pop());

        System.out.println(stack1.getSize());
        System.out.println(stack1.peek());
        System.out.println(stack1.pop());

        System.out.println(stack1.toString());
    }

    static class GenericStack<E> {

        private int size = 8;
        private int index;
        private E[] list = (E[]) new Object[size];

        public int getSize() {
            return index;
        }

        public E peek() {
            return list[index - 1];
        }

        public void increaseSize() {

            E[] list2 = (E[]) new Object[size * 2];
            size = size * 2;
            System.arraycopy(list, 0, list2, 0, list.length);
            list = list2;
        }

        public void push(E o) {
            if (index < size) {
                list[index] = o;
                index++;
            } else {
                increaseSize();
                push(o);
            }
        }

        public E pop() {
            E o = list[--index];
            list[index] = null;
            return o;
        }

        public boolean isEmpty() {
            return list.length == 0;
        }

        @Override
        public String toString() {
            return "stack: " + Arrays.toString(list);
        }
    }
}

