package lesson10HW.task3;

public class Orange extends Fruit implements GettingWeight{
    @Override
    public double getWeight() {
        return 1.5;
    }
    /*private String color;
    private static final double DEFAULT_APPLE_WEIGHT = 1.5;

    public Orange(String color) {
        this.color = color;
    }*/
}
