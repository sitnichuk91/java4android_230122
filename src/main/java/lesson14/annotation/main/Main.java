package lesson14.annotation.main;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(1);

        cat.setAge(5);

        System.out.println(cat);

        cat.doWork("Job");
    }
}
