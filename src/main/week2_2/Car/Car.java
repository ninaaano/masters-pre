package main.week2_2.Car;// @ author ninaaano

// 코어님과 페어프로그래밍, 싱글톤 패턴
public class Car {
    private static int registerNumber = 1000;
    private int carNumber;

    public Car() {
        carNumber = registerNumber++;
    }

    public int showCarNumber() {
        return carNumber;
    }
}

