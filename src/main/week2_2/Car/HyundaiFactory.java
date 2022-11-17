package main.week2_2.Car;// @ author ninaaano

import com.sun.source.tree.BreakTree;

/*
Initialization on demand holder idiom (holder에 의한 초기화)
클래스 안에 클래스(holder)를 두어 JVM의 클래스 로더 매커니즘과 클래스가 로드되는 시점을 이용한 방법
클래스 안에 선언한 클래스인 holder에서 선언된 인스턴스는 static이기 때문에 클래스 로딩시점에서 한번만 호출된다.
또한 final을 사용해서 다시 값이 할당되지 않도록 만드는 방식을 사용한 것
 */
public class HyundaiFactory {

    private HyundaiFactory(){
    }

    private static class LazyHolder{
        public static final HyundaiFactory hyundaiFactory = new HyundaiFactory();
    }

    // getInstance()
    public static HyundaiFactory getFactory(){
        return LazyHolder.hyundaiFactory;
    }

    public Car createCar(){
        return new Car();
    }


    /*
// 원래 사용한 방법(게으른 초기화)

    private static HyundaiFactory hyundaiFactory;

    private HyundaiFactory() {
    }

    public static HyundaiFactory getFactory() {
        if (hyundaiFactory == null) {
            hyundaiFactory = new HyundaiFactory();
        }
        return hyundaiFactory;
    }
     */

}
