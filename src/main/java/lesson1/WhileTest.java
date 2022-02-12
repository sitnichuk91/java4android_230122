package lesson1;

public class WhileTest {
    static int orangesCount = 10;

    public static void main(String[] args) {
        int appleCount = 15;
        while (appleCount >= 0){
            System.out.println("Apples left: " + appleCount);
            appleCount --;
        }

        while (isOrangeCountPositive()){
            eatOrange();
            printOrangeCount();
        }
        do {
            eatOrange();
            printOrangeCount();
        } while (isOrangeCountPositive());

        System.out.println("""
                Orange
                Banana
                Apple
                """);
    }

    private static void printOrangeCount() {
        System.out.println("Oranges left: " + orangesCount);
    }

    private static void eatOrange() {
        orangesCount--;
    }

    private static boolean isOrangeCountPositive() {
        return orangesCount > 0;
    }
}
