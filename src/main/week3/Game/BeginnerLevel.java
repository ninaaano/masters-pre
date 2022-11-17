package main.week3.Game;// @ author ninaaano

public class BeginnerLevel implements PlayerLevel {

    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("Jump 할 줄 모르지롱.");
    }

    @Override
    public void turn() {
        System.out.println("Turn 할 줄 모르지롱.");
    }

    public int level(){
        return 1;
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

