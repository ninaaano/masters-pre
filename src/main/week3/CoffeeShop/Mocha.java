package main.week3.CoffeeShop;// @ author ninaaano

public class Mocha extends Decorator {
    public Mocha(Coffee coffeeComponent) {
        super(coffeeComponent);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.print(" Adding Mocha Syrup");
    }
}
