package com.exercise1;

public class Truck extends Vehicle implements Fuel {
    private int numPassenger;
    private float weight;

    public Truck(String cor, String marca, String modelo, int numPassenger, float weight) {
        super(cor, marca, modelo);
        this.numPassenger = numPassenger;
        this.weight = weight;
    }

    @Override
    public void drive() {
        System.out.println("Dirigindo o caminhão " + getMarca() + " " + getModelo()
                + " " + super.getCor()+" peso máximo " + maxWeight());
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo o caminhão " + getMarca() + " " + getModelo());
    }

    public int numberOfPassenger() {
        return numPassenger;
    }

    public float maxWeight() {
        return weight;
    }
}