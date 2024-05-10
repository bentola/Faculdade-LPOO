package com.exercise1;

public class ElectricCar extends Car implements Electric {
    public ElectricCar(String cor, String marca, String modelo, int numPassenger, float weight) {
        super(cor, marca, modelo, numPassenger, weight);
    }

    @Override
    public void start() {
        System.out.println("Carro elétrico " + getMarca() + " " + getModelo() + " movimentando");
    }

    @Override
    public void carregarBateria() {
        System.out.println("Carregando a bateria do carro " + getCor());
    }
}
