package lesson8.part1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Duck duck = new Duck();
        Plane plane = new Plane();

        Runner[] runners = {cat, dog, duck};
        Flying[] flyings = {duck, plane};

        cat.run();
        duck.swim();

        Swimming[] swimmings = {dog, duck};
        Participant[] participants = new Participant[5];
    }
}
