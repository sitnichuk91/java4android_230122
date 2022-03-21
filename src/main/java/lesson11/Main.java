package lesson11;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        testArrayList();
//        testLinkedList();
//        testSet();
        testMap();
    }

    private static void testArrayList() {

        List<ArrayList<Integer>> arrayListArrayList = new ArrayList<>();

        ArrayList<String> arrayList = new ArrayList<>(10);
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add(0, "X");
        arrayList.add(2, "Y");

        arrayList.remove("D");
        arrayList.remove(2);

        /*for (String s : arrayList) {
            System.out.println("->" + s);
        }*/

        /*ListIterator<?> iterator = arrayList.listIterator();
        while (iterator.hasNext()){
            String s = (String) iterator.next();
            System.out.println("->" + s);
        }*/

//        arrayList.clear();
        /*arrayList.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("->" + s);
            }
        });*/
//        arrayList.forEach((s) -> System.out.println("->" + s));
//        arrayList.forEach(System.out::println);

//        Object[] objects = arrayList.toArray();
//        String[] strings = arrayList.toArray(new String[0]);

//        arrayList.trimToSize();


        Collections.addAll(arrayList, "Aaa", "Ddd", "Bbb", "Rrr");
        Collections.addAll(arrayList, new String[]{"Aaa", "Ddd", "Bbb", "Rrr"});
        Collections.shuffle(arrayList);
        Collections.sort(arrayList);
        Collections.sort(arrayList, (s1, s2) -> s1.length() - s2.length());
        Collections.sort(arrayList, Comparator.comparingInt(String::length));
//        Collections.reverse(arrayList);
//        Collections.rotate(arrayList, 1);
//        System.out.println(Collections.binarySearch(arrayList, "Rrr"));
//        Collections.replaceAll(arrayList, "Ddd", "New Ddd");

        // Stream API //

        List<Integer> integerArrayList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(integerArrayList.stream().filter(e -> e % 2 == 0).collect(Collectors.toList()));
        System.out.println(integerArrayList.stream().filter(e -> e % 2 == 0).count() + " четных чисел");

        System.out.println(arrayList);
    }


    private static void testLinkedList() {
        List<Integer> integerList = new LinkedList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        System.out.println(integerList);
    }

    private static void testSet() {
        Set<Integer> set = new HashSet<>();
        Collections.addAll(set, 1,2,1,5,1,4,1,4,2,3,5,4,1,2,3,5,6,7);

        System.out.println(set);

        Set<Integer> linkedSet = new LinkedHashSet<>();
        Collections.addAll(linkedSet, 7,1,2,1,5,1,4,1,4,2,3,5,4,1,2,3,5,6,7);

        System.out.println(linkedSet);
    }

    private static void testMap() {
        Map<String, String> map = new HashMap<>();

        map.put("Russia", "Moscow");
        map.put("France", "Paris");
        map.put("Germany", "Berlin");
        map.put("Norway", "Oslo");

        /*for (String key : map.keySet()) {
            System.out.printf("Key: %s \t\t value: %s%n", key, map.get(key));
        }*/

        /*for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.printf("Key: %s \t\t value: %s%n", entry.getKey(), entry.getValue());
        }*/

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.printf("Key: %s \t\t value: %s%n", key, value);
            }
        });
        map.forEach((String key, String value) -> System.out.printf("Key: %s \t\t value: %s%n", key, value));

        System.out.println(map);


    }
}
