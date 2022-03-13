package lesson9HW;

import java.io.IOException;

public class MyArraySizeException extends NumberFormatException {
    public MyArraySizeException() {
        super ("Неверный размер массива");
    }
}
