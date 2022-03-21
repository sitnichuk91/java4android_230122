package lesson11HW;

import java.util.*;
import java.util.function.BiConsumer;

public class Task1 {
    public static void main(String[] args) {
        uniqueWords(new String[] {"A", "b", "A", "C", "c", "F", "X", "y", "A", "B", "A", "C", "C", "F", "x", "Y"});
    }

    private static void uniqueWords(String[] array) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toUpperCase();
        }
        Collections.addAll(set, array);
        System.out.println(set);

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < set.size(); i++) {
            map.put((String) set.stream().toArray()[i], 0);
        }
        Map<String, Integer> uniqueMap = new HashMap<>();
        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String key,Integer value) {
                int temp = 0;
                for (int i = 0; i < array.length; i++) {
                    if (key.equals(array[i])){
                        temp++;
                    }
                }
                map.put(key, temp);
            }
        });
        map.forEach((String key, Integer value) -> System.out.printf("Word: %s \t\t Quantity: %s%n", key, value));
    }
}
