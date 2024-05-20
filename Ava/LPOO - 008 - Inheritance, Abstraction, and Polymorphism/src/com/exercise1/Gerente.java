package com.exercise1;

public class Gerente extends Funcionario {
	private double bonusAnual;

	public Gerente(String nome, String telefone, double salario, double bonusAnual) {
		super(nome, telefone, salario);
		this.bonusAnual = bonusAnual;
	}

	public double getBonusAnual() {
		return bonusAnual;
	}

	public void setBonusAnual(double bonusAnual) {
		this.bonusAnual = bonusAnual;
	}

	@Override
	public String toString() {
		return "Gerente[" + super.toString() + ",bonus=" + bonusAnual + "]";
	}

}
