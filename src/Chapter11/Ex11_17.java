package Chapter11;

import java.util.*;

public class Ex11_17 {
    public static void main(String[] args) {

        //Algebra - perfect square
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        ArrayList<Integer> factors = findFactors(num);

        System.out.println(factors); //original list with all the factors

        factors = removeEven(factors); //assigning a new array list with removed even # of factors

        removeDuplicates(factors); //removing duplicates from the new array list of only odd # of factors

        System.out.println(factors);

        int n = 1;
        for (Integer e : factors) {
            n *= e;
        }

        System.out.println("The smallest number n to be a perfect square is: " + n);
        System.out.println("m * n is " + num * n);

    }

    public static ArrayList<Integer> findFactors(int num) {

        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                factors.add(i);
                num = num / i;
                i--;
            }
        }
        return factors;
    }

    public static ArrayList<Integer> removeEven(ArrayList<Integer> factors) {
        ArrayList<Integer> removeDuplicates = new ArrayList<>();

        int occurrence;

        for (int i = 0; i < factors.size(); i++) {

            occurrence = 0;

            for (int j = 0; j < factors.size(); j++) {

                if (factors.get(i) == factors.get(j)) {
                    occurrence++;
                }
            }

            if (occurrence == 0 || occurrence % 2 != 0)
                removeDuplicates.add(factors.get(i));
        }
        return removeDuplicates;
    }

    public static void removeDuplicates(ArrayList<Integer> factors) {

        for (int i = 0; i < factors.size(); i++) {

            for (int j = i + 1; j < factors.size(); j++) {

                if (factors.get(i) == factors.get(j)) {
                    factors.remove(j);
                    j--;
                }
            }
        }
    }


}
