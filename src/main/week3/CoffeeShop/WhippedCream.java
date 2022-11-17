package main.week3.CoffeeShop;// @ author ninaaano

public class WhippedCream extends Decorator {
    public WhippedCream(Coffee coffeeComponent) {
        super(coffeeComponent);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.print(" Adding WhippedCream");
    }
}
