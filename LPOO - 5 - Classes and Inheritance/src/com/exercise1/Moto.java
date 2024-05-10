package com.exercise1;

public class Moto extends Veiculo {
	private double tamCorrente;

	public Moto() {
		super();
	}

	public Moto(String marca, String modelo, String cor, double tamCorrente) {
		super(marca, modelo, cor);
		this.tamCorrente = tamCorrente;
	}

	public double getTamCorrente() {
		return tamCorrente;
	}

	public void setTamCorrente(double tamCorrente) {
		this.tamCorrente = tamCorrente;
	}

	public String toString() {
		return "Moto " + super.toString() + " tamCorrente " + tamCorrente;
	}

}
