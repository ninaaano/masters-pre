package main.week3.CoffeeShop;// @ author ninaaano

public class Latte extends Decorator {
    public Latte(Coffee coffeeComponent) {
        super(coffeeComponent);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.print(" Adding Milk");
    }
}
