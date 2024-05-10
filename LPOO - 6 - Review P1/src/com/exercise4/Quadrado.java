package com.exercise4;

public class Quadrado extends Poligono {
	private double lado;

	public Quadrado() {

	}

	public Quadrado(String nome, int numLados, double lado) {
		super(nome, numLados);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double calcularArea() {
		double area = lado * lado;
		return area;
	}

	public String toString() {
		return super.getNome() + " tem " + super.getNumLados() + " lados e área= "
				+ String.format("%.1f", calcularArea());

	}

}
