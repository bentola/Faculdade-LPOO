package com.exercise1;

public class Bike extends Vehicle {
    private int numPassenger;
    private float weight;

    public Bike(String cor, String marca, String modelo, int numPassenger, float weight) {
        super(cor, marca, modelo);
        this.numPassenger = numPassenger;
        this.weight = weight;
    }

    @Override
    public void drive() {
        System.out.println("Guiando a bicicleta " + getMarca() + " " + getModelo() + " " + getCor()
                + " peso máximo " + maxWeight());
    }

    public float maxWeight() {
        return weight;
    }
}
