package com.exercise1;

public class ElectricBike extends Bike implements Electric {
    public ElectricBike(String cor, String marca, String modelo, int numPassenger, float weight) {
        super(cor, marca, modelo, numPassenger, weight);
    }

    @Override
    public void start() {
        System.out.println("Bicicleta elétrica " + getMarca() + " " + getModelo() + " movimentando");
    }

    @Override
    public void carregarBateria() {
        System.out.println("Carregando a bateria da bicicleta " + getCor());
    }
}
