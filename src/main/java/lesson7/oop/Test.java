package lesson7.oop;

import java.util.concurrent.ThreadLocalRandom;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat("Martin Luther Cat", 30);
        Plate plate = new Plate(150);

        plate.printInfo();
        cat.eat(plate, cat);

        plate.fillPlate(150);

        Cat[] catArray = new Cat[5];
        createCats(catArray);
        cat.allCatsEat(catArray, plate);



    }

    private static void createCats(Cat[] catArray) {
        for (int i = 0; i < catArray.length; i++) {
            catArray[i] = new Cat("Cat" + i, 20);
        }
    }
}
