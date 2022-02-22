package lesson6HW;

public class Dog extends Animals{
    public Dog(String nickname) {
        super(nickname);
    }

    @Override
    public void run(int distance) {
        if (distance > 500){
            System.out.println(nickname + " has run 500 meters and stopped");
        }else super.run(distance);
    }

    @Override
    public void swim(int distance) {
        if (distance > 10){
            System.out.println(nickname + " is a submarine now.");
        }else super.swim(distance);
    }
}
