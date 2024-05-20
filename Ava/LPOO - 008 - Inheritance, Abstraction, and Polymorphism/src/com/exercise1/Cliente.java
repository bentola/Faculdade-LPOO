package com.exercise1;

public class Cliente extends Pessoa {
	private int pontuacao;

	public Cliente(String nome, String telefone) {
		super(nome, telefone);
	}

	public Cliente(String nome, String telefone, int pontuacao) {
		super(nome, telefone);
		this.pontuacao = pontuacao;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	@Override
	public String toString() {
		return "Cliente:" + super.toString() + ",pontuacao=" + pontuacao;
	}

}
