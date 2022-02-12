package lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
//        testRandoms();
        testConsoleInput();
//        helloName();
    }

    private static void helloName() {
        String name = in.next();
        System.out.println("Hello, " + name + "!");
    }

    private static void testConsoleInput() {
        int num1 = getNumFromUser();
        int num2 = getNumFromUser();
        in.close();

        TestMethods.multiply(num1, num2);
    }

    private static int getNumFromUser() {
        while (true) {
            if (in.hasNextInt()){
                return in.nextInt();
            }
            System.out.println(in.next() + " is not an Integer number!");
        }
    }

    private static void testRandoms() {
        int[] data = new int[40];
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(); // -2147kk to +2147kk
            data[i] = random.nextInt(10); // 0 to 9
            data[i] = random.nextInt(8) + 3; // 3 to 10
            data[i] = random.nextInt(3, 11); // 3 to 10
            data[i] = random.nextInt(-5, 7); // -5 to 6
            data[i] = random.nextInt(12) - 5;// -5 to 6
            data[i] = (int)(Math.random() * 10); // from 1 to 9 incl
        }
        System.out.println(Arrays.toString(data));
    }
}
