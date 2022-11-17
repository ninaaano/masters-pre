package main.week3.Game;// @ author ninaaano

import static main.week3.Game.Player.level;

public class AdvancedLevel implements PlayerLevel {
    @Override
    public void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("높이 jump 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("Turn 할 줄 모르지롱.");
    }

    @Override
    public void go(int time) {
        level.run();
        for (int i = 0; i < time; i++) {
            level.jump();
        }
        level.turn();
    }

    public void showLevelMessage(){
        System.out.println("Lv.2");
    }



}

