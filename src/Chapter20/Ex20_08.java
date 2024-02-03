package Chapter20;

import java.util.*;

public class Ex20_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Integer> lottery = new ArrayList<>();
        List<Integer> guess = new ArrayList<>();

        Integer rand = new Random().nextInt(1) + 112;
        Integer num = input.nextInt();

        int a = rand;
        int b = num;

        //three digit lottery
        for (int i = 0; i < 3; i++) {
            lottery.add(rand % 10);
            rand = rand / 10;
        }

        for (int i = 0; i < 3; i++) {
            guess.add(num % 10);
            num = num / 10;
        }


        Collections.sort((List<Integer>) lottery);
        Collections.sort((List<Integer>) guess);

        System.out.println(lottery);
        System.out.println(guess);


        //exact order win 10000
        if (a == b) {
            System.out.println("win 10000");
        } else if (lottery.equals(guess)) {
            System.out.println("win 3000");
        } else if (lottery.containsAll(guess.subList(0, 2)) || lottery.containsAll(guess.subList(1,guess.size()))) {
            System.out.println("win 2000");
        } else if (lottery.contains(guess.get(0)) || lottery.contains(guess.get(1)) ||
                   lottery.contains(guess.get(2))) {
            System.out.println("win 1000");
        } else {
            System.out.println("no win");
        }


        //all digits matched but not in order win 3000


        //two digit match win 2000

        //one digit match win 1000
    }
}
