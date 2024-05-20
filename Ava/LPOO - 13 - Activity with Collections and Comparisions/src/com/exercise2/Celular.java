package com.exercise2;

class Celular implements Comparable<Celular> {
	private int codigo;
	private String marca;
	private String modelo;

	public Celular(int codigo, String marca, String modelo) {
		super();
		this.codigo = codigo;
		this.marca = marca;
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "COD:" + codigo + ",marca:" + marca + ",modelo:" + modelo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int compareTo(Celular celular) {
		return this.marca.compareTo((celular).getMarca());
	}

}
