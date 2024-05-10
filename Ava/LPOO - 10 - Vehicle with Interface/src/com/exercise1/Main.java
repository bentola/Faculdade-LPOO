package com.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bike bike1 = new Bike(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextFloat());
        ElectricBike eleBike1 = new ElectricBike(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextFloat());
        ElectricCar eleCar1 = new ElectricCar(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextFloat());
        Truck truck1 = new Truck(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextFloat());
        bike1.drive();
        eleBike1.start();
        eleBike1.carregarBateria();
        eleCar1.start();
        eleCar1.carregarBateria();
        truck1.abastecer();
        truck1.drive();
    }
}

















