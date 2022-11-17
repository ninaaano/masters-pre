package main.week3.departmentStoreRefactoring;// @ author ninaaano

public class RED extends Member{
    @Override
    public int getDiscountRate(int shoppingAmount) {
        return shoppingAmount;
    }

    @Override
    public int getParkingFee(int timeSpent) {
        return timeSpent * 3000;
    }

    @Override
    public int getPoint(int shoppingAmount) {
        return (int) (shoppingAmount * 0.01);
    }
}
