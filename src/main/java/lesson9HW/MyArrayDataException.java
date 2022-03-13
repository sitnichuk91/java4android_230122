package lesson9HW;

public class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException() {
        super("Один из элеметов массива не является числом");
    }


}
