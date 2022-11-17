package main.week3.departmentStoreRefactoring;// @ author ninaaano

public class DIAMOND extends Member{
    @Override
    public int getDiscountRate(int shoppingAmount) {
        double discountMoney = shoppingAmount * 0.1;
        return (int) (shoppingAmount - discountMoney);
    }

    @Override
    public int getParkingFee(int timeSpent) {
        return 0;
    }

    @Override
    public int getPoint(int shoppingAmount) {
        return (int) (shoppingAmount * 0.1);
    }

    @Override
    public String getGrade(String name) {
        return name + "님, 전문 상담원이 배정 됩니다.";
    }
}
