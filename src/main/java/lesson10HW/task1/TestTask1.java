package lesson10HW.task1;

public class TestTask1 {
    public static void main(String[] args) {
        Storage<String> intArray = new Storage<>(8);

        intArray.add("1", 0);
        intArray.add("2", 1);
        intArray.add("3", 2);
        intArray.add("4", 3);
        intArray.add("5", 4);

        intArray.print();

        intArray.exchange(0, 1);

        intArray.print();
    }
}
