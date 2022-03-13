package lesson9;

import jdk.jshell.SourceCodeAnalysis;
import lesson6.Bard;
import lesson6.Knight;
import lesson6.Player;
import lesson6.Wizard;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    private final static String LIB = "src/main/resources/lib/";

    public static void main(String[] args) {
//        testException(0);
//        divideNum(1);
//        System.out.println(testFinally(30, 0));
//        testScanner();
        /*try {
            readFile("text", "txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Oh noooooooo!!!!");
            System.exit(1);
        }*/

        dancePlayers();
    }




    private static void testException(int a) {
//        System.out.println(3 / 0);
//        RuntimeException e = new RuntimeException("Opps, smth wrong");
//        throw e;
        if (a == 0) {
            throw new IllegalArgumentException("Wrong argument:" + a);
        } else {
            System.out.println(5 / a);
        }
    }

    private static void divideNum(int n) {
        int a;
        try {
            a = 3 / n;
            throw new RuntimeException("Smth unpredictable");
        } catch (ArithmeticException | NumberFormatException e) {
            e.printStackTrace();
            a = -1;
        } catch (RuntimeException e) {
            e.printStackTrace();
            a = 123;
            try {
                Thread.sleep(-100);
            } catch (InterruptedException | IllegalArgumentException ex) {
                ex.printStackTrace();
                a = 954;
            }
        }
        System.out.println(a);
    }

    private static int testFinally(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return -1;
        } finally {
            return 0;
        }
    }

    private static void testScanner() {
        /*Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            scanner.close();
        } catch (Exception e){
            e.printStackTrace();
//            scanner.close();
        } finally {
            scanner.close();
        }*/

        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void readFile() {
        File file = new File(LIB + "text1.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("I'm sorry");
            System.exit(1);
        }
        System.out.println(scanner.nextLine());
    }

    private static void readFile(String fileName, String extFile)  throws FileNotFoundException {
        File file = new File(LIB + fileName + "." + extFile);
        Scanner scanner = new Scanner(file);

        System.out.println(scanner.nextLine());
    }

    private static void dancePlayers() {
       Player knight1 = new Knight("Roman", 1000);
        Player knight2 = new Knight("Andrew", 2000);
       Player wizard1 = new Wizard("Alexander", 900);
       Player wizard2 = new Wizard("Luther", 100);
        Player bard = new Bard("Eminem", 5);

        Player[] players = {bard, knight1, knight2, wizard1, wizard2};

        for (int i = 0; i < players.length; i++) {
            Player player = players[i];

            System.out.println(player.getNickname() + " passed face control");
            try {
                if (player instanceof Bard b){
                    throw new BardFoundException(i, player.getNickname());
                }
                player.action();
            } catch (BardFoundException e) {
                e.printStackTrace();
                System.out.println(player.getNickname() + " hasn't passed face control");
            }
        }
    }
}
