package com.exercise2;

public class Usuario extends Pessoa {
	private String Senha;

	public Usuario(String nome, int idade) {
		super(nome, idade);
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

	public String criarEmail(String email1) {
		setEmail(email1);
		return email1;
	}

	public String toString() {
		return "Usuario: " + super.getNome() + ", Idade " + super.getIdade() + " email: " + super.getEmail()
				+ " senha: " + Senha;
	}

}
