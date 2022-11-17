package main.week3.departmentStoreRefactoring;// @ author ninaaano

public class Customer {
    private String name; // 이름
    private Member member;
    private int shoppingAmount; // 쇼핑 금액
    private int timeSpent; // 머문 시간

    public Customer(String name, Member member, int shoppingAmount, int timeSpent) {
        this.name = name;
        this.member = member;
        this.shoppingAmount = shoppingAmount;
        this.timeSpent = timeSpent;
    }

    public int getDiscountRate(int shoppingAmount) {
        return member.getDiscountRate(shoppingAmount);
    }

    public int getParkingFee(int timeSpent) {
        return member.getParkingFee(timeSpent);
    }

    public int getPoint(int shoppingAmount) {
        return member.getPoint(shoppingAmount);
    }

    @Override
    public String toString() {
        return name + "님의 지불 금액은 " + member.getDiscountRate(shoppingAmount) + "원이고, " +
                "적립 포인트는 " + member.getPoint(shoppingAmount) + "점 입니다. 주차 요금은 " + member.getParkingFee(timeSpent) + "원 입니다. " + member.getGrade(name) ;
    }
}
