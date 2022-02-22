package lesson6HW;

public class Main {
    public static void main(String[] args) {
        Cat murzik = new Cat("Murzik");
        Dog bobik = new Dog("Bobik");

        murzik.run(700);
        bobik.run(700);

        System.out.println();
        murzik.swim(15);
        bobik.swim(5);
        bobik.swim(11);
    }
}
