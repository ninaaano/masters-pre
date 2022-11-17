package main.week3.Game;// @ author ninaaano

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

    public int level(){
        return 3;
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

