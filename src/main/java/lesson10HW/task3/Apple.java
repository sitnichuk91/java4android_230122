package lesson10HW.task3;

public class Apple extends Fruit implements GettingWeight{
    @Override
    public double getWeight() {
        return 1.0;
    }
    /*private String color;
    private static final double DEFAULT_APPLE_WEIGHT = 1.0;

    public Apple(String color) {
        this.color = color;
    }*/
}
