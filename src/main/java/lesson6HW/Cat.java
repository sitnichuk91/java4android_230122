package lesson6HW;

public class Cat extends Animals{

    public Cat(String nickname) {
        super(nickname);
    }

    @Override
    public void run(int distance) {
        if (distance > 200){
            System.out.println(nickname + " has run 200 meters and stopped");
        } else super.run(distance);
    }

    @Override
    public void swim(int distance) {
        System.out.println(nickname + " couldn't swim. We will remember him!☺");
    }
}
