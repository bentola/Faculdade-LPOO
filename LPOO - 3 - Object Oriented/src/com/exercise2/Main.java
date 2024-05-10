package com.exercise2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome = sc.nextLine();
		int idade = sc.nextInt();
		Pessoa pessoa1 = new Pessoa(nome, idade);
		System.out.println(pessoa1);
		idade = sc.nextInt();
		pessoa1.setIdade(idade);
		System.out.println(pessoa1);
	}
}
