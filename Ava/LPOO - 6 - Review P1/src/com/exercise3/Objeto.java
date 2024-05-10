package com.exercise3;

public class Objeto {
	private String nome;
	private double altura;
	private double largura;
	private double peso;

	public Objeto() {

	}

	public Objeto(String nome, double altura, double largura, double peso) {
		super();
		this.nome = nome;
		this.altura = altura;
		this.largura = largura;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String toString() {
		return nome + ", " + String.format("%.1f", altura) + " x " + String.format("%.1f", largura) + " e peso="
				+ String.format("%.1f", peso);
	}

}
