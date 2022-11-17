package main.week3.departmentStoreRefactoring;// @ author ninaaano

public class PLATINUM extends Member{
    @Override
    public int getDiscountRate(int shoppingAmount) {
        double discountMoney = shoppingAmount * 0.05;
        return (int) (shoppingAmount - discountMoney);
    }

    @Override
    public int getParkingFee(int timeSpent) {
        return timeSpent * 1000;
    }

    @Override
    public int getPoint(int shoppingAmount) {
        return (int) (shoppingAmount * 0.05);
    }
}
