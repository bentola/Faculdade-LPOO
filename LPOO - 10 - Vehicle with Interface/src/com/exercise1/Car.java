package com.exercise1;

public class Car extends Vehicle {
    private int numPassenger;
    private float weight;

    public Car(String cor, String marca, String modelo, int numPassenger, float weight) {
        super(cor, marca, modelo);
        this.numPassenger = numPassenger;
        this.weight = weight;
    }

    @Override
    public void drive() {
        System.out.println("Dirigindo o carro " + getMarca() + " " + getModelo() + " que tem peso máximo "
                + maxWeight() + " e número de Passageiro " + numberOfPassenger());
    }

    public int numberOfPassenger() {
        return numPassenger;
    }

    public float maxWeight() {
        return weight;
    }
}
