package lesson3;

import java.util.Arrays;

public class TestMethods {
    public static void main(String[] args) {
        multiply(3, 4);
        multiply(3.4, 5.6);
        int[] arr = new int[7];
        Arrays.fill(arr, 2);
        arr[0] = 1;
        arr[5] = 1;
        System.out.println(Arrays.toString(arr));
        multiply(arr);

    }

    static void multiply(int a, int b) {
        int multResult = a * b;
        System.out.printf("%d * %d = %d(integer)\n", a, b, multResult);
    }
    private static void multiply(double a, double b) {
        double multResult = a * b;
        System.out.printf("%.2f * %.2f = %f(double)\n", a, b, multResult);
    }
    private static void multiply(int[] a) {
        int multResult = 1;
        for (int i = 0; i < a.length; i++) {
            multResult = multResult * a[i];
        }
        System.out.printf("Произведение всех чисел массива равно %d.\n", multResult);
    }
}
