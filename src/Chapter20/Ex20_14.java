package Chapter20;

import java.util.*;

public class Ex20_14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Stack<String> stack = new Stack<>();

        String s = input.nextLine();

        for (int i = 0; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i))) {
                stack.add(s.charAt(i) + "");

            } else if (s.charAt(i) != ' '){
                stack.add(s.charAt(i) + "");
                compute(stack);
            }
        }

        System.out.println(stack.pop());
    }

    public static void compute(Stack<String> stack) {

        String operator = stack.pop();
        int num2 = Integer.parseInt(stack.pop());
        int num1 = Integer.parseInt(stack.pop());

        switch(operator) {
            case "-": stack.push((num1-num2) + "");
            break;
            case "+": stack.push((num1+num2) + "");
            break;
            case "*": stack.push((num1 * num2) + "");
            break;
            case "/": stack.push((num1 / num2) + "");
            break;

        }
    }
}
