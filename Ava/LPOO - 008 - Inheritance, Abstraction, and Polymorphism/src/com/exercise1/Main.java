package com.exercise1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario func1 = new Funcionario(sc.next(), sc.next(), sc.nextDouble());
		Gerente ger1 = new Gerente(sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble());
		Cliente cli1 = new Cliente(sc.next(), sc.next());
		Cliente cli2 = new Cliente(sc.next(), sc.next(), sc.nextInt());
		
		
		System.out.println(func1);
		System.out.println(ger1);
		System.out.println(cli1);
		System.out.println(cli2);
		ger1.setSalario(sc.nextDouble());
		System.out.println(ger1);
	}
}
