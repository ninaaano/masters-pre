package main.week3.departmentStore;// @ author ninaaano

public enum CustomerRating {
    /*
RED	할인률 적용 없음, 1% 포인트 적립	3000원
PLATINUM	5% 할인률 적용, 5% 포인트 적립	1000원
DIAMOND	10% 할인률 적용, 10%포인트 적립, 전문 상담원 배정	무료
     */
    RED(0, 0.01, false, 3000),
    PLATINUM(5, 0.05, false, 1000),
    DIAMOND(10, 0.1, true, 0);

    int discountRate; // 할인율
    double pointAccumulate; // 포인트 적립
    boolean counselorAssignment; // 상담원 배정
    int parkingFee; // 주차요금

    CustomerRating(int discountRate, double pointAccumulate, boolean counselorAssignment, int parkingFee) {
        this.discountRate = discountRate;
        this.pointAccumulate = pointAccumulate;
        this.counselorAssignment = counselorAssignment;
        this.parkingFee = parkingFee;
    }

    public boolean isCounselorAssignment() {
        return counselorAssignment;
    }
}
