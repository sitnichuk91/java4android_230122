package lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private static int size = 3;

    private static final char DOT_EMPTY = '•';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';

    private static char[][] MAP;
    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();

    private static final String HEADER_FIRST_SYMBOL = "♥";
    private static final String SPACE_MAP = " ";
    private static int turnsCount;

    public static void turnGame() {
        do {
            System.out.println("\n\nWelcome to TicTacToe game!!!");
            init();
            printMap();
            playGame();
        } while (isContinueGame());
        endGame();
    }

    private static void init() {
        turnsCount = 0;
        enterMapSize();
        MAP = new char[size][size];

        initMap();
    }

    private static void enterMapSize() {
        System.out.print("Пожайлуйтса, введите размер игрового поля от 3 до 15: ");
        size = in.nextInt();
    }


    private static void initMap() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printMapHeader();
        printMapBody();
    }

    private static void printMapHeader() {
        System.out.print(SPACE_MAP + HEADER_FIRST_SYMBOL + SPACE_MAP);
        for (int i = 0; i < size; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void printMapBody() {
        for (int i = 0; i < size; i++) {
            printMapNumber(i);
            for (int j = 0; j < size; j++) {
                System.out.printf("%2c ", MAP[i][j]);
            }
            System.out.println();
        }
    }

    private static void printMapNumber(int i) {

        System.out.printf("%2d ", i + 1);
    }

    private static void playGame() {
        while (true) {
            humanTurn();
            printMap();
            if (checkEnd(DOT_HUMAN)){
                break;
            }

            aiTurn();
            printMap();
            if (checkEnd(DOT_AI)){
                break;
            }
        }
    }




    private static void humanTurn() {
        System.out.println("ХОД ЧЕЛОВЕКА");

        int rowNumber;
        int columnNumber;

        while (true) {
            rowNumber = getValidNumberFromUser() - 1;
            columnNumber = getValidNumberFromUser() - 1;
            if (isCellFree(rowNumber,columnNumber)){
                break;
            }
        }
        MAP[rowNumber][columnNumber] = DOT_HUMAN;
        turnsCount++;
    }



    private static int getValidNumberFromUser() {
        while (true){
            System.out.print("Введите координату(1-" + size + "): ");
            if (in.hasNextInt()){
                int n = in.nextInt();
                if (isNumberValid(n)){
                    return n;
                }
                System.out.println("\nЗначение координаты должно быть в пределах от 1 до " + size);
            } else {
                in.next();
                System.out.println("\nВвод допускает лишь целые числа");
            }
        }
    }

    private static boolean isNumberValid(int n) {
        return n >= 1 && n <= size;
    }
    private static boolean isCellFree(int rowNumber, int columnNumber) {
        return MAP[rowNumber][columnNumber] == DOT_EMPTY;

    }

    private static void aiTurn() {
        System.out.println("ХОД КОМПЬЮТЕРА");

        int rowNumber;
        int columnNumber;

        do {
            rowNumber = random.nextInt(size);
            columnNumber = random.nextInt(size);

        } while (!isCellFree(rowNumber,columnNumber));
        MAP[rowNumber][columnNumber] = DOT_AI;
        turnsCount++;
    }
    private static boolean checkEnd(char symbol) {
        if (checkWin(symbol)){
            if (symbol == DOT_HUMAN){
                System.out.println("\nУра! Вы победили!");
            } else {
                System.out.println("\nВыиграл сраный компуктер!");
            }
            return true;
        }
        if (checkDraw()){
            System.out.println("Ничья!");
            return true;
        }
        return false;
    }

    private static boolean checkDraw() {
        /*for (char[] chars : MAP) {
            for (char symbol : chars) {
                if (symbol == DOT_EMPTY){
                    return false;
                }
            }
        }
        return true;*/
        return turnsCount >= size * size;
    }

    private static boolean checkWin(char symbol) {
        if (MAP[0][0] == symbol && MAP[0][1] == symbol && MAP[0][2] == symbol){
            return true;
        }
        if (MAP[1][0] == symbol && MAP[1][1] == symbol && MAP[1][2] == symbol){
            return true;
        }
        if (MAP[2][0] == symbol && MAP[2][1] == symbol && MAP[2][2] == symbol){
            return true;
        }
        if (MAP[0][0] == symbol && MAP[1][0] == symbol && MAP[2][0] == symbol){
            return true;
        }
        if (MAP[0][1] == symbol && MAP[1][1] == symbol && MAP[2][1] == symbol){
            return true;
        }
        if (MAP[0][2] == symbol && MAP[1][2] == symbol && MAP[2][2] == symbol){
            return true;
        }
        if (MAP[0][0] == symbol && MAP[1][1] == symbol && MAP[2][2] == symbol){
            return true;
        }
        if (MAP[0][2] == symbol && MAP[1][1] == symbol && MAP[2][0] == symbol){
            return true;
        }
        return false;
    }
    private static boolean isContinueGame() {
        System.out.println("Wanna play one more time? y\\n");
        return switch (in.next()){
            case "y", "yes", "Yes", "Y", "Да", "Д" -> true;
            default -> false;
        };
    }
    private static void endGame() {
        in.close();
        System.out.println("See you!!!!!");
    }
}
