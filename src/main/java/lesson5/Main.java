package lesson5;

public class Main {
    public static void main(String[] args) {

        Team team = new Team();
        team.name = "Angels";

        Player player1 = new Player("Victor", 80, 1500, 3256);
        Player player2 = new Player("Dmitri");
        Player player3 = new Player("Alex", 67, 750, 7600);
        Player player4 = new Player("Ali", 6, 70, 600);

        /*player1.nickname = "Victor";
        player2.nickname = "Dmitri";*/
        player1.setLevel(15000000);
        player2.setMoney(player2.getMoney() + 400);
        /*System.out.println("Player 1: " + player1.nickname + ", level " + player1.level);
        System.out.println("Player 2: " + player2.nickname + ", level " + player2.level);*/

        System.out.println();

        System.out.println(player1);
        System.out.println(player2);

        System.out.println();

        player1.printInfo();
        player2.printInfo();
        player3.printInfo();
        System.out.println();

        Player[] players = {player1, player2, player3, player4};
        for (Player player : players) {
            if (player.getPoints() > 300){
                player.printInfo();
            } else {
                System.out.println(player.getNickname() + "'s points amount is less than 300.");
            }
        }
        System.out.println("Total players number: "+ Player.getPlayersCount());
    }
}

