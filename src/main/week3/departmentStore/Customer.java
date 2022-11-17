package main.week3.departmentStore;// @ author ninaaano

public class Customer {
    // 고객 이름	등급	쇼핑 금액	머문 시간
    private String name; //
    private CustomerRating customerRating; // enum으로 작성한 고객 등급
    private int shoppingAmount; // 쇼핑 금액
    private int timeSpent; // 머문 시간

    public String getName() { // 이름 반환
        return name;
    }

    public Customer(String name, CustomerRating customerRating, int shoppingAmount, int timeSpent) {
        this.name = name;
        this.customerRating = customerRating;
        this.shoppingAmount = shoppingAmount;
        this.timeSpent = timeSpent;
    }

    public int getDiscountRate() { // 할인율 -> 지불 금액
        double translate = customerRating.discountRate * 0.01; // %를 소숫점으로 변한 값
        double discountMoney = shoppingAmount * translate;
        return (int) (shoppingAmount - discountMoney);
    }

    public int getParkingFee() { // 주차요금 = 머문시간 * 주차요금
        return customerRating.parkingFee * timeSpent;
    }

    public int getPoint() { // 등급별로 적립되는 포인트가 다르다. 할인되기 전 지불한 가격에서 적립
        return (int) (customerRating.pointAccumulate * shoppingAmount);
    }

    @Override
    public String toString() {
        if (customerRating.counselorAssignment) {
            return "전문 상담원 배정이 가능합니다.";
        }
        return "";
    }
}
