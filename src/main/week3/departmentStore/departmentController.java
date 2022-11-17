package main.week3.departmentStore;// @ author ninaaano

import java.util.Arrays;

public class departmentController {
    public static void main(String[] args) {
        /*
James	RED	10000원	2시간
Tomas	RED	30000원	2시간
Edward	PLATINUM	10000원	2시간
Percy	PLATINUM	30000원	2시간
Elizabet	DIAMOND	30000원	2시간
         */

        Customer James = new Customer("James", CustomerRating.RED, 10000, 2);
        Customer Tomas = new Customer("Tomas", CustomerRating.RED, 30000, 2);
        Customer Edward = new Customer("Edward", CustomerRating.PLATINUM, 10000, 2);
        Customer Percy = new Customer("Percy", CustomerRating.PLATINUM, 30000, 2);
        Customer Elizabet = new Customer("Elizabet", CustomerRating.DIAMOND, 30000, 2);

        Arrays.asList(James, Tomas, Edward, Percy, Elizabet)
                .forEach(customer -> System.out.println(customer.getName() + "님의 지불 금액은 " + customer.getDiscountRate() + "원이고, " +
                        "적립 포인트는 " + customer.getPoint() + "점 입니다. 주차 요금은 " + customer.getParkingFee() + "원 입니다. " +
                        customer.toString()));
    }
}
