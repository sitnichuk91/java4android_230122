package lesson9;

import java.io.IOException;

public class BardFoundException extends IOException {
    public BardFoundException() {
        super("Bard is not allowed here");
    }
    public BardFoundException(int index, String name) {
        super(String.format("%s player number %s has tried to enter the party", name, index));
    }
}
