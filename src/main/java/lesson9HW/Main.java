package lesson9HW;

public class Main {
    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3", "s"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        try{
            if (array.length != 4 || array[0].length != 4){
                throw new MyArraySizeException();
            }
            arraySum(array);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
            System.out.println("Wrong 2d array size!");;
        }
    }

    private static void arraySum(String[][] array) {
        try{
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    sum += Integer.parseInt(array[i][j]);
                }
            }
            System.out.println("Сумма чисел всего массива равна: " + sum);
        } catch (Exception e) {
            throw new MyArrayDataException();
        }
    }

}
