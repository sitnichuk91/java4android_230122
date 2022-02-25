package lesson7.oop;

import javax.sound.midi.Soundbank;
import java.util.concurrent.ThreadLocalRandom;

public class Plate {
    private int foodCount;

    public Plate(int foodCount) {
        this.foodCount = foodCount;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "foodCount=" + foodCount +
                '}';
    }

    public void decreaseFood(int catEatFoodCount, Cat cat) throws InterruptedException {
        while (true){
            if (foodCount >= catEatFoodCount){
                foodCount -= catEatFoodCount;
                cat.setSatiety(cat.getSatiety() - catEatFoodCount);
                Thread.sleep(3000);
                System.out.println(this);
                System.out.println(cat);
            }
            else {
                System.out.println(cat.getName() + " хочет сожрать больше, чем есть в тарелке!");
                break;
            }
            if (cat.getSatiety() > 0){
                System.out.println(cat.getName() + " не наелся");
                continue;
            } else {
                System.out.println(cat.getName() + " наелся!");
                break;
            }
        }
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(int foodCount) {
        this.foodCount = foodCount;
    }

    public void decreaseFoodAllCats(int satiety, Cat cat) throws InterruptedException {
        while (true){
            if (foodCount >= satiety){
                int a = ThreadLocalRandom.current().nextInt(1, satiety);
                foodCount -= a;
                cat.setSatiety(cat.getSatiety() - a);
                Thread.sleep(3000);
                System.out.println(this);
                System.out.println(cat);
            }
            else {
                System.out.println(cat.getName() + " хочет сожрать больше, чем есть в тарелке!");
                break;
            }
            if (cat.getSatiety() > 0){
                System.out.println(cat.getName() + " не наелся");
                continue;
            } else if (cat.getSatiety() < 0) {
                System.out.println(cat.getName() + " обожрался!");
                break;
            } else {
                System.out.println(cat.getName() + " наелся!");
                break;
            }
        }
    }

    public void fillPlate(int i) {
        this.foodCount = i;
        System.out.println("Досыпали корм в тарелку. Уровень корма: " + i);
    }
}
