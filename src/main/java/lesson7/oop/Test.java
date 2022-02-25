package lesson7.oop;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat("Martin Luther Cat");
        Plate plate = new Plate(10);

        plate.printInfo();

        while (plate.getFoodCount() > 0) {
            cat.eat(plate);
            plate.printInfo();
            Thread.sleep(3000);
        }
    }
}
