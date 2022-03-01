package lesson8.homework;

public class Participant implements Running, Jumping {
    @Override
    public void jump(Obstacle obstacle) {

    }

    @Override
    public void run(Obstacle obstacle) {

    }

    int getRunLimit() {
        return 0;
    }
    int getJumpLimit() {
        return 0;
    }
}
