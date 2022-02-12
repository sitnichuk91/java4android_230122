package lesson3;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Collections;

public class TestArrays {

    static final int ARRAY_SIZE = 11;
    static final int SECOND_ARRAY_SIZE = 11;
    //константа, поле класса
    public static void main(String[] args) {
//        testOneArray();
        testTwoArray();
    }



    private static void testOneArray() {
        int[] data = new int[ARRAY_SIZE];
        int[] newData = {1, 2, 3, 4, 5, 6};
        Arrays.fill(data, -1);


        data[0] = 3;
        data[3] = 6;
        data[4] = 7;
        data[data.length - 1] = 1;

        Arrays.sort(data);
        System.out.println(Arrays.toString(data));
        System.out.println();

        String[] strArr = new String[10];
        System.out.println(Arrays.toString(strArr));

        Integer[] name = new Integer[10];
        Arrays.fill(name, 1);
        name[1] = 1;
        name[2] = 4;
        name[3] = 777;
        Arrays.sort(name, Collections.reverseOrder());
        System.out.println(Arrays.toString(name));

        /*for (int i = 0; i < data.length; i++) {
            System.out.printf("[%d] ", data[i]);
        }*/

        /*System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);
        System.out.println(data[4]);*/
    }
    private static void testTwoArray() {
        int[][] twoArray = new int[ARRAY_SIZE][SECOND_ARRAY_SIZE];
//        int[][] deepData = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 45}};
        int[][] deepData = new int[ARRAY_SIZE][ARRAY_SIZE];

        int n = 1;
        for (int i = 0; i < deepData.length; i++) {
            for (int j = 0; j < deepData[i].length; j++) {
                deepData[i][j] = n++;
            }
        }

        /*for (int i = 0; i < deepData.length; i++) {
            for (int j = 0; j < deepData[i].length; j++) {
                System.out.print(deepData[i][j] + " ");
            }
            System.out.println();
        }*/

        for (int[] element : deepData){
            for (int num : element) {
                System.out.printf("%3d ", num);
            }
            System.out.println();
        }

    }
}
