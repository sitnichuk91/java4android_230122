package lesson7.oop;

import java.util.concurrent.ThreadLocalRandom;

public class Cat {
    private String name;
    private int satiety;

    public Cat(String name, int satiety) {
        this.name = name;
        this.satiety = satiety;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", satiety=" + satiety +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public void eat(Plate plate, Cat cat) throws InterruptedException {
        plate.decreaseFood(ThreadLocalRandom.current().nextInt(4) + 3, cat);

    }

    public void allCatsEat(Cat[] catArray, Plate plate) throws InterruptedException {
        for (int i = 0; i < catArray.length; i++) {
            plate.decreaseFoodAllCats(catArray[i].getSatiety(), catArray[i]);
        }
    }
}
