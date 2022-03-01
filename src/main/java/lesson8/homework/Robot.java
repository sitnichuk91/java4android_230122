package lesson8.homework;

public class Robot extends Participant implements Running, Jumping {
    private String name;
    private int runLimit;
    private int jumpLimit;

    public Robot(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public String getName() {
        return name;
    }
    @Override
    public int getRunLimit() {
        return runLimit;
    }
    @Override
    public int getJumpLimit() {
        return jumpLimit;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void run(Obstacle obstacle) {
        System.out.println(name + " успешно пробежал " + obstacle.getDistance() + " м");
    }

    @Override
    public void jump(Obstacle obstacle) {
        System.out.println(name + " успешно перепрыгнул " + obstacle.getDistance() + " м");
    }
}
