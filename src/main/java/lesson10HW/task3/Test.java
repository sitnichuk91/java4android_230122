package lesson10HW.task3;

public class Test {
    public static void main(String[] args) {
        Box<Apple> boxOfApples1 = new Box<>();
        boxOfApples1.add(new Apple());
        boxOfApples1.add(new Apple());
        boxOfApples1.add(new Apple());
        boxOfApples1.add(new Apple());
        boxOfApples1.add(new Apple());
        boxOfApples1.add(new Apple());
        boxOfApples1.add(new Apple());
        boxOfApples1.add(new Apple());
        boxOfApples1.add(new Apple());

        System.out.println("Weight of Apples1: " + boxOfApples1.getWeight());

        Box<Orange> boxOfOranges = new Box<>();
        boxOfOranges.add(new Orange());
        boxOfOranges.add(new Orange());
        boxOfOranges.add(new Orange());
        boxOfOranges.add(new Orange());
        boxOfOranges.add(new Orange());
        boxOfOranges.add(new Orange());

        System.out.println("Weight of Oranges: " + boxOfOranges.getWeight());

        System.out.println("Apples = Oranges: " + boxOfApples1.compare(boxOfOranges));

        Box<Apple> boxOfApples2 = new Box<>();
        boxOfApples2.add(new Apple());
        boxOfApples2.add(new Apple());
        boxOfApples2.add(new Apple());

        boxOfApples1.pour(boxOfApples2);

        System.out.println("New weight of Apples1: " + boxOfApples1.getWeight());
    }
}
