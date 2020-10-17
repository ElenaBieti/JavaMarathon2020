package day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player(100);
        Player player2 = new Player(50);
        Player player3 = new Player(90);

        Player.info();

        Player player4 = new Player(89);
        Player player5 = new Player(20);
        Player player6 = new Player(30);

        Player.info();

        Player player7 = new Player(90);

        Player.info();

        for (int i = 0; i < 50; i ++)
        player2.run();

        Player.info();

    }
}
