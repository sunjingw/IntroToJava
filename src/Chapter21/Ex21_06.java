package Chapter21;

import java.util.*;
public class Ex21_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Map<Integer, Integer> map = new TreeMap<>();

        List<Integer> list = Arrays.stream(input.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .toList();

        for (Integer e : list) {
            if (!map.containsKey(e)) {
                map.put(e, 1);
            } else {
                int value = map.get(e);
                map.put(e, ++value);
            }
        }

        int max = Collections.max(map.values());
        for(Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == max) {
                System.out.print(e.getKey() + " ");
            }
        }
    }
}
