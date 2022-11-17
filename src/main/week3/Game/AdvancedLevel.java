package main.week3.Game;// @ author ninaaano

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

    public int level(){
        return 2;
    }

    @Override
    public void play(int time) {
        run();
        for (int i = 0; i < time; i++) {
            jump();
        }
        turn();
    }
}

