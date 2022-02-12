package lesson1;

public class Lesson2 {
    public static void main(String[] args) {
        sumVarsAndPrint(3, 5);
        sumVarsAndPrint(-1, -5);
        sumVarsAndPrint(0, 4);
        printNumsAndResult(5, -9);

        final int SEASON_NUMBER = 1;
        final int MONTH_NUMBER = 12 ;
        convertSeason(SEASON_NUMBER);
        convertSeasonSwitch(SEASON_NUMBER);
        monthToSeasonAndPrint(MONTH_NUMBER);
    }

    private static void convertSeason(int seasonNumber) {
        String season;
        if (seasonNumber == 1){
            season = "Winter";
        } else if (seasonNumber == 2){
            season = "Spring";
        } else if (seasonNumber == 3){
            season = "Summer";
        } else if (seasonNumber == 4){
            season = "Fall";
        } else season = "Unknown season";
        System.out.println(season + "\n");
    }


    private static int sumVarsAndReturn(int a, int b) {
        int res = a + b;
        return res;
    }

    private static void sumVarsAndPrint(int a, int b) {
        int result = a + b;
        System.out.println("The sum of numbers is: " + result);
    }

    private static void printNumsAndResult(int a, int b) {
        int result = sumVarsAndReturn(a, b);
        System.out.printf("%d + %d = %d%n", a, b, result);

    }

    private static void convertSeasonSwitch(int seasonNumber) {
        /*String season;
        switch (seasonNumber) {
            case 1:
                season = "Winter";
                break;
            case 2:
                season = "Spring";
                break;
            case 3:
                season = "Summer";
                break;
            case 4:
                season = "Fall";
            default:
                season = "Unknown season";
        }*/
        String season = switch (seasonNumber){
            case 1 -> "Winter";
            case 2 -> "Spring";
            case 3 -> "Summer";
            case 4 -> "Fall";
            default -> "Unknown season";
        };
        System.out.println("Switch method:");
        System.out.println(season + "\n");
    }

    public static void monthToSeasonAndPrint (int monthNumber){
        String season = switch (monthNumber){
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Fall";
            default -> "Unknown season";
        };
        System.out.println("Switch method(short):");
        System.out.println(season);
    }
}
