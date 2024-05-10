package com.exercise4;

public class ContaCorrente extends Conta {

	public ContaCorrente() {

	}

	public ContaCorrente(String agencia, int numero, String titular) {
		super(agencia, numero, titular);
	}

	public void gerarTarifa() {
		double valor = 14.5;
		setSaldo(getSaldo() - valor);
		System.out.println("Conta="+getNumero()+", tarifa de " + String.format("%.1f", valor) + ". Saldo = "+ getSaldo());
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
