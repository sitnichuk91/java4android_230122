package lesson1;

public class ForTest {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        for (int i = 9; i >= 0; i--) {
            System.out.print(i + " ");
        }
        final int LIMIT_OF_CYCLE = 9;
        System.out.println("\n");

        for (int i = 0; i < LIMIT_OF_CYCLE; i++) {
            for (int j = 0; j < LIMIT_OF_CYCLE; j++) {
                System.out.printf("  i = %d j = %d%n", i, j);
            }
            System.out.println("\n");
        }
        String smile = "";
        for (int i = 0; i < LIMIT_OF_CYCLE; i++) {
            if (i % 2 == 0) {
                smile += "☻ ";
            } else smile += "☺ ";
            System.out.print(smile);

            for (int j = 0; j < LIMIT_OF_CYCLE - 1 - i; j++) {
                System.out.print("😸 ");
            }
            System.out.println();
        }

        for (int i = 0; i <= 20; i++) {
            if (i == 12){
                break;
            }
            if (i % 2 != 0){
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
