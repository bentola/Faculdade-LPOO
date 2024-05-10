package com.exercise4;

public class Poligono {
	private String nome;
	private int NumLados;

	public Poligono() {

	}

	public Poligono(String nome, int lados) {
		super();
		this.nome = nome;
		this.NumLados = lados;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumLados() {
		return NumLados;
	}

	public void setNumLados(int lados) {
		this.NumLados = lados;
	}

}
