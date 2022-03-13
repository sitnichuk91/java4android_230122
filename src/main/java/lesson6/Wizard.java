package lesson6;

public class Wizard extends Player{

    public Wizard(String nickname, int points) {
        super(nickname, points);
    }

    @Override
    public void action() {
        System.out.println("Wizard " + getNickname() + " doing something");
    }
}
