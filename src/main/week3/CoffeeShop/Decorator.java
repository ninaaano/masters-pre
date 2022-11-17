package main.week3.CoffeeShop;// @ author ninaaano

abstract public class Decorator implements Coffee{
    private Coffee coffeeComponent;

    public Decorator(Coffee coffeeComponent) {
        this.coffeeComponent = coffeeComponent;
    }

    @Override
    public void brewing() {
        coffeeComponent.brewing();
    }
}
