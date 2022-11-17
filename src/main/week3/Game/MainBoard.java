package main.week3.Game;// @ author ninaaano

public class MainBoard {

    public static void main(String[] args) {

        Player player = new Player();
        player.play(1);
        player.upgradeLevel(Player.ADVANCED_LEVEL);
        player.play(2);
        player.upgradeLevel(Player.SUPER_LEVEL);
        player.play(3);

    }
}
