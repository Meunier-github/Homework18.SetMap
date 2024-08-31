import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        System.out.println("Задача 1");
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num.toString() + " ");
            }
        }

        System.out.println("");
        System.out.println("Задача 2");
        Collections.sort(nums);
        Set<Integer> mySet = new HashSet<Integer>(nums);

        for (Integer num : mySet) {
            if (num % 2 == 0) {
                System.out.print(num.toString() + " ");
            }
        }

        System.out.println("");
        System.out.println("Задача 3");
        List<String> strings = new ArrayList<>(List.of("три", "один", "два", "два", "три", "три", "три"));
        Set<String> mySet1 = new HashSet<String>(strings);
        for (String num : mySet1) {
            System.out.print(num.toString() + " ");
        }

        System.out.println("");
        System.out.println("Задача 4");
        HashMap<String, Integer> map = new HashMap<>();

        for (String t : strings) {
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);

            } else {
                map.put(t, 1);
            }
        }
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(map.get(key));
        }
    }
}