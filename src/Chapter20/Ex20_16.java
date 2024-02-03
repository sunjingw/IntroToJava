package Chapter20;

import java.util.*;

public class Ex20_16 {
    static String exp = "";

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String s = input.nextLine();

        System.out.println(infixToPostfix(s));

    }

    public static String infixToPostfix(String expression) {

        Stack<String> operand = new Stack<>();
        Stack<String> operator = new Stack<>();

        StringTokenizer s = new StringTokenizer(expression, "()*/+-", true);

        while (s.hasMoreTokens()) {
            String str = s.nextToken();

            if (str.equals("*") || str.equals("/")) {

                while (operator.size() > 0 && (operator.peek().equals("*") || operator.peek().equals("/"))) {
                    compute(operand, operator);
                }

                operator.push(str);

            } else if (str.equals("+") || str.equals("-")) {
                while (operator.size() > 0 && (operator.peek().equals("*") || operator.peek().equals("/") ||
                        operator.peek().equals("+") || operator.peek().equals("-"))){

                    compute(operand, operator);
                }
                operator.push(str);

            } else if (str.equals("(")) {
                operator.add(str);
            } else if (str.equals(")")) {

                while (!operator.peek().equals("(")) {
                    compute(operand, operator);
                }
                operator.pop();
            } else {
                exp = exp + str + " ";
            }
        }

        compute(operand, operator);

        return exp;
    }

    public static void compute(Stack<String> operand, Stack<String> operator) {


        String op = operator.pop();
        //int num2 = Integer.parseInt(operand.pop());
        //int num1 = Integer.parseInt(operand.pop());

        exp = exp + op + " ";

    }
}
