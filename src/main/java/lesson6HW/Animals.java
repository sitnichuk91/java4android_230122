package lesson6HW;

public class Animals {
    String nickname;

    public Animals(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public void run(int distance){
        System.out.println(nickname + " has run " + distance + " meters.");
    }
    public void swim(int distance){
        System.out.println(nickname + " has swum " + distance + " meters.");
    }
    @Override
    public String toString() {
        return "Animals{" +
                "nickname='" + nickname + '\'' +
                '}';
    }
}
