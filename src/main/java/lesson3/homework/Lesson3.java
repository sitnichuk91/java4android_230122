package lesson3.homework;

import java.util.Arrays;
import java.util.List;

public class Lesson3 {
    public static void main(String[] args) {
//        changeArray(new int[]{1, 0, 1, 0, 1});
//        arrayFill(new int[100]);
//        arrayMultiply(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
//        changeTwoDimensionalArray(new int[9][9]);
//        createArray(5, 1);
//        arrayPrintMinAndMax(new double[]{1.0, 0.1, 1.5, 0.2, 1.5, 7, 15.4, 41.8, -5.5});
//        checkBalance(new int[]{1, 1, 1, 2, 1});
//        System.out.println(Arrays.toString(moveArray(new int[]{1, 2, 3, 6}, 100)));
    }


    private static int[] changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
                continue;
            }
            arr[i] = 0;
        }
        return arr;
    }

    private static int[] arrayFill(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    private static int[] arrayMultiply(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        return arr;
    }

    private static int[][] changeTwoDimensionalArray(int[][] arr) {
        int[][] newArray = changeFirstDiagonal(arr);
        return changeSecondDiagonal(newArray);
    }

    private static int[][] changeFirstDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
            }
        }
        return arr;
    }

    private static int[][] changeSecondDiagonal(int[][] arr) {
        int row = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[row][i] = 1;
            row++;
        }
        return arr;
    }

    private static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }

    private static void arrayPrintMinAndMax(int[] arr) {
        Arrays.sort(arr);
        System.out.printf("Минимальное значение: %d.\nМаксимальное значение: %d.", arr[0], arr[arr.length - 1]);
    }

    private static void arrayPrintMinAndMax(double[] arr) {
        Arrays.sort(arr);
        System.out.printf("Минимальное значение: %.1f.\nМаксимальное значение: %.1f.\n", arr[0], arr[arr.length - 1]);
    }

    public boolean checkBalance(int[] arr) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            a += arr[i];
            int b = 0;
            for (int j = i + 1; j <= arr.length - 1; j++) {
                b += arr[j];
            }
            if (a == b) {
                return true;
            }
        }
        return false;
    }

    public int[] moveArray(int[] arr, int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int temp = arr[0];
                arr[0] = arr[arr.length - 1];

                for (int j = 1; j < arr.length - 1; j++) {
                    arr[arr.length - j] = arr[arr.length - j - 1];
                }

                arr[1] = temp;
            }
        }
        else if (n < 0) {
            for (int i = 0; i > n; i--) {
                int temp = arr[arr.length - 1];
                arr[arr.length - 1] = arr[0];

                for (int j = 1; j < arr.length - 1; j++) {
                    arr[j - 1] = arr[j];
                }

                arr[arr.length - 2] = temp;
            }
        }
        return arr;
    }

}
