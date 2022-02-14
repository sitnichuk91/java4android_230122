package lesson5;

import java.util.Locale;

public class Player {

    private static int playersCount = 0;

    private String nickname;
    private int points;
    private int level;
    private int money;

    public Player(String nickname, int level, int points, int money) {
        this.nickname = nickname.toUpperCase();
        this.points = points;
        this.level = level;
        this.money = Math.abs(money);

        playersCount++;
    }

    public Player(String nickname) {
        this(nickname, 1, 0, 100);
    }

    public static int getPlayersCount() {
        return playersCount;
    }

    public static void setPlayersCount(int playersCount) {
        Player.playersCount = playersCount;
    }

    public void printInfo(){
        System.out.println(this/*.toString()*/);
    }

    @Override
    public String toString() {
        return String.format("Player %s: level %d, points %d, money %d", nickname, level, points, money);
    }

    public String getNickname() {
        return nickname;
    }

    /*public void setNickname(String nickname) {
        this.nickname = nickname;
    }*/

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if (money < 0 || money > Short.MAX_VALUE){
            System.out.println("Wrong value:" + money);
        } else {
            this.money = money;
        }
    }
}
