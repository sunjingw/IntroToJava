package Chapter20;

import java.io.*;
import java.util.*;

public class Ex20_11 {
    public static void main(String[] args) throws IOException {

        LinkedList<Character> list = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        File file = new File("./src/Chapter20/Ex20_09.java");

        try(BufferedInputStream input = new BufferedInputStream(new FileInputStream(file))) {

            int value;
            boolean match = true;
            while ((value = input.read()) != -1) {

                if (value == (int) '{' || value == (int) '}' || value == (int) '[' || value == (int) ']' ||
                        value == (int) '(' || value == (int) ')') {

                    //push into stack
                    stack.add((char) value);

                    if (value == (int) ']') {
                        match = pop(stack, list, '[');

                    } else if (value == (int) ')') {
                        match = pop(stack, list, '(');

                    } else if (value == (int) '}') {
                        match = pop(stack, list, '{');
                    }

                    //once a closing symbol found then pop into a linkedlist
                    //check linkedlist for first/last match
                }

                if (!match) {
                    System.out.println("mismatch");
                    break;
                }

            }
        }

        System.out.println("Pairs all match");

        //System.out.println(list);

//        Iterator<Character> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            if (((LinkedList<Character>)list).getFirst().equals(((LinkedList<Character>)list).getLast())) {
//                System.out.println("Removing " + ((LinkedList<Character>) list).getFirst().toString());
//                ((LinkedList<Character>) list).removeFirst();
//                System.out.println("Removing last " + ((LinkedList<Character>) list).getLast().toString());
//                ((LinkedList<Character>)list).removeLast();
//            } else {
//                System.out.println();
//                System.out.println("Not correct pairs");
//                break;
//            }
//        }

    }

    private static <E> boolean pop(Stack<E> stack, LinkedList<E> list, char c) {

        //System.out.println(stack);

        while ((char)stack.peek() != c) {
            list.add(stack.pop());
        }
        list.add(stack.pop());

        //System.out.println(list);

        Iterator<E> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (((char)list.getFirst() == '}' && (char)list.getLast() == c) ||
                    (((char)list.getFirst() == ')' && (char)list.getLast() == c)) ||
                    ((char)list.getFirst() == ']' && (char)list.getLast() == c)) {
                list.removeFirst();
                list.removeLast();
            } else {
                System.out.println("not correct pairs");
                return false;
            }
        }
        return true;
    }
}
