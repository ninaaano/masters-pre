package main.week3.departmentStoreRefactoring;// @ author ninaaano

abstract class Member {
    // 등급별로 계산하는 클래스 구분하기
    public abstract int getDiscountRate(int shoppingAmount);
    public abstract int getParkingFee(int timeSpent);
    public abstract int getPoint(int shoppingAmount);

    public String getGrade(String name){
        return name + "님, 일반 상담원이 배정됩니다.";
    }



}
