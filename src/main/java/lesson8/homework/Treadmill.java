package lesson8.homework;

public class Treadmill extends Obstacle {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int getDistance() {
        return length;
    }
}
