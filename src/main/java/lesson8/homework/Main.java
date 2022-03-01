package lesson8.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Participant[] participantsArr = {new Cat("Kitty", 3000, 3), new Human("Jack", 1500, 2), new Robot("Wall-e", 5000, 1)};
        Obstacle[] obstaclesArr = {new Treadmill(1000), new Wall(3)};

        sayParameters(obstaclesArr);

        for (int i = 0; i < participantsArr.length; i++) {
            for (int j = 0; j < obstaclesArr.length; j++) {
                if (obstaclesArr[j].getClass() == Treadmill.class){
                    if (participantsArr[i].getRunLimit() >= obstaclesArr[j].getDistance()){
                        participantsArr[i].run(obstaclesArr[j]);
                        Thread.sleep(3000);
                    } else {
                        System.out.println(participantsArr[i] + " не смог пробежать " + obstaclesArr[j].getDistance() + " м");
                        Thread.sleep(3000);
                        break;
                    }
                } else {
                    if (participantsArr[i].getJumpLimit() >= obstaclesArr[j].getDistance()){
                        participantsArr[i].jump(obstaclesArr[j]);
                        Thread.sleep(3000);
                    } else {
                        System.out.println(participantsArr[i] + " не смог перепрыгнуть " + obstaclesArr[j].getDistance() + " м");
                        Thread.sleep(3000);
                    }
                }
            }
        }
    }

    private static void sayParameters(Obstacle[] obstaclesArr) throws InterruptedException {
        for (int i = 0; i < obstaclesArr.length; i++) {
            if (obstaclesArr[i].getClass() == Treadmill.class){
                System.out.println("Забег на " + obstaclesArr[i].getDistance() + " м");
            } else {
                System.out.println("Высота стены: " + obstaclesArr[i].getDistance() + " м");
            }
        }
        Thread.sleep(1000);

    }
}
