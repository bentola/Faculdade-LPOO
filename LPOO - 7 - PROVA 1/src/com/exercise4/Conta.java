package com.exercise4;

public class Conta {
	private String agencia;
	private int numero;
	private String titular;
	private double saldo;

	public Conta() {

	}

	public Conta(String agencia, int numero, String titular) {
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean sacar(double valor) {
		if (valor < saldo) {
			saldo -= valor;
			System.out.println("Conta=" + numero + ", saque de " + valor + ". Saldo = " + saldo);
			return true;
		} else {
			System.out.println("Valor do saque não permitido");
			return false;
		}
	}

	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Conta=" + numero + ", deposito de " + valor + ". Saldo = " + saldo);
	}

	public boolean transferir(Conta contaDestino, double valor) {
		if (sacar(valor) == true) {
			contaDestino.depositar(valor);
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return titular+" Ag=" + agencia + ", num=" + numero + ", saldo=" + saldo ;
	}

}
