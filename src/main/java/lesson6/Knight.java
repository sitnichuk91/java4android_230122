package lesson6;

public class Knight extends Player{

    public Knight(String nickname, int points) {
        super(nickname, points);
    }

    @Override
    public void action() {
        System.out.println("Knight " + getNickname() + " doing something");
    }
}
