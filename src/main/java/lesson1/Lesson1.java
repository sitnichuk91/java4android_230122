package lesson1;
import java.util.concurrent.ThreadLocalRandom;

public class Lesson1 {
    public static void main(String[] args) {
//        printHelloWorld();
//          testWars();
        checkAppraisal();
        testChecksAppraisal();
    }




    static void printHelloWorld() {
        System.out.println("Hello, world!");
    }

    private static void testWars() {
        int varA = 9;
        int varB = 5;
        int result = varA / varB;
        long longA = 10000000000L;

        System.out.println(result);

        double doubleVarA = 9;
        float floatVarB = 3.5f;

        double result2 = varA / varB;
        double result3 = 1.0 * varA / varB;
        double result4 = (double) varA / varB;
        System.out.println(result2);

        result += 10;

        char ch1 = 1234;
        char ch2 = '☺';

        System.out.println(ch1);
        System.out.println(ch2);

        String helloStr = "Hello";
        String worldStr = "World";

        System.out.println(helloStr + ", " + worldStr + "!");

    }
    private static void checkAppraisal() {
        int appraisal = ThreadLocalRandom.current().nextInt(-5, 10);
        System.out.println("Your mark is " + appraisal);

        if(appraisal == 5) {
            System.out.println("Well done!");
        } else if (appraisal == 4){
            System.out.println("Could do betteer");
        } else if (appraisal >= 1 && appraisal <= 3){
            System.out.println("That's really bad2!");
        } else {
            System.out.println("Wrong value!");
        }
        System.out.println("Checking is over!");
    }

    private static void testChecksAppraisal() {
        checkAppraisalWithArgs(5);
        checkAppraisalWithArgs(4);
        checkAppraisalWithArgs(3);
        checkAppraisalWithArgs(2);
        checkAppraisalWithArgs(1);
        checkAppraisalWithArgs(-1);
        checkAppraisalWithArgs(6);
    }

    private static void checkAppraisalWithArgs(int appraisal) {
        System.out.println("Your mark is " + appraisal + ".");

        if(appraisal == 5) {
            System.out.println("Well done!");
        } else if (appraisal == 4){
            System.out.println("Could do betteer");
        } else if (appraisal >= 1 && appraisal <= 3){
            System.out.println("That's really bad2!");
        } else {
            System.out.println("Wrong value!");
        }
        System.out.println("Checking is over!\n");
    }
}
