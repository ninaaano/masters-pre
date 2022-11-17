package main.week3.Game;// @ author ninaaano

import static main.week3.Game.Player.level;

public class SuperLevel implements PlayerLevel {
    @Override
    public void run() {
        System.out.println("엄청 빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("아주 높이 jump 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("한 바퀴 돕니다.");
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
        System.out.println("Lv.3");
    }

}

