package main.week3.Game;// @ author ninaaano

public class Player {

    static PlayerLevel level;
    public static final PlayerLevel BEGINNER_LEVEL = new BeginnerLevel();
    public static final PlayerLevel ADVANCED_LEVEL = new AdvancedLevel();
    public static final PlayerLevel SUPER_LEVEL = new SuperLevel();

    public Player() {
        level = BEGINNER_LEVEL;
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
    }

    public void play(int count) {
        level.run();
        for (int i = 0; i < count; i++) {
            level.jump();
        }
        level.turn();
    }
}
