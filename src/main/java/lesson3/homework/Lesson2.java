package homework;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(sumNumbersCompare(10, 5)); // Task#1
        isPositiveAndPrint(0); // Task#2
        System.out.println(isNegativeBoolean(15)); // Task#3
        printString("JustARandomString", 7);// Task#4
        printYear(404); // Task#5
    }

    private static boolean sumNumbersCompare(int num1, int num2) {
        boolean result = ((num1 + num2) >= 10 && (num1 + num2) <= 20) ? true : false;
        return result;
    }

    private static void isPositiveAndPrint(int num) {
        if (num >= 0){
            System.out.println(num + " is positive.");
        } else System.out.println(num + " is negative.");
    }

    private static boolean isNegativeBoolean(int num) {
        if (num >= 0){
            return false;
        } else return true;
    }

    private static void printString(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    private static void printYear(int year) {
        if (leapYear(year) == true) {
            System.out.println(year + " is a leap year.");
        } else System.out.println(year + " is not a leap year.");
    }

    private static boolean leapYear(int year) {
        if (year % 400 == 0){
            return true;
        } else if (year % 4 == 0 && year % 100 != 0){
            return true;
        } else return false;
    }
}
