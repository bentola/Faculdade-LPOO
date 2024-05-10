package com.exercise2;

public class Fatura {
	private String descricao;
	private int qtde;
	private double preco;

	public Fatura() {
	}

	public Fatura(String descricao, int qtde, double preco) {
		this.descricao = descricao;
		this.qtde = qtde;
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getQtde() {
		return qtde;
	}

	public double getPreco() {
		return preco;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPrecoTotal() {
		return getQtde() * getPreco();
	}

	public String toString() {

		return qtde + " " + descricao + " a R$ " + String.format("%.1f", preco) + " = R$ " + getPrecoTotal();
	}
}
