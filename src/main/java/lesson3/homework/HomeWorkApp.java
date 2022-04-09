package homework;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords("Orange", "Banana", "Apple");
        checkSumSign(-15, 5);
        printColor(160);
        compareNumbers(400, 56);
    }




    private static void printThreeWords(String fruit1, String fruit2, String fruit3) {
        System.out.println(fruit1);
        System.out.println(fruit2);
        System.out.println(fruit3);
    }

    private static void checkSumSign(int a, int b) {
        int result = a + b;

        if (result >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers(int a, int b) {
        if (a >= b){
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }
}
