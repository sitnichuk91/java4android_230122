package lesson6;

public class Bard extends Player{
    public Bard(String nickname, int points) {
        super(nickname, points);
    }

    @Override
    public void action() {
        System.out.println("Bard" + getNickname() + " is singing");
    }
}
