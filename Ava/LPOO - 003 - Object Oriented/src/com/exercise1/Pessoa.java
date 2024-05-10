package com.exercise1;

public class Pessoa {
	private String Nome;
	private int Idade;

	public Pessoa() {
	}

	public Pessoa(String Nome, int Idade) {
		this.Nome = Nome;
		this.Idade = Idade;
	}

	public String getString() {
		return Nome;
	}

	public void setString(String Nome) {
		this.Nome = Nome;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int Idade) {
		this.Idade = Idade;
	}

	public String toString() {
		return Nome + " tem " + Idade + " anos";
	}

}
