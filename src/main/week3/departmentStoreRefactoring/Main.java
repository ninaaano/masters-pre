package main.week3.departmentStoreRefactoring;// @ author ninaaano

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        RED red = new RED();
        PLATINUM platinum = new PLATINUM();
        DIAMOND diamond = new DIAMOND();

        Customer James = new Customer("James", red, 10000, 2);
        Customer Tomas = new Customer("Tomas", red, 30000, 2);
        Customer Edward = new Customer("Edward", platinum, 10000, 2);
        Customer Percy = new Customer("Percy", platinum, 30000, 2);
        Customer Elizabet = new Customer("Elizabet", diamond, 30000, 2);

        Arrays.asList(James, Tomas, Edward, Percy, Elizabet)
                .forEach(customer -> System.out.println(customer.toString()));
    }
}
