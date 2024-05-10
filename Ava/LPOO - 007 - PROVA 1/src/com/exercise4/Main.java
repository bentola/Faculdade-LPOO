package com.exercise4;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContaCorrente cc1 = new ContaCorrente(sc.next(), sc.nextInt(), sc.next());
		ContaCorrente cc2 = new ContaCorrente(sc.next(), sc.nextInt(), sc.next());
		cc1.depositar(sc.nextDouble());
		cc2.depositar(sc.nextDouble());
		cc1.transferir(cc2, sc.nextDouble());
		cc1.gerarTarifa();
		System.out.println("ContaCorrente " + cc1);
		System.out.println("ContaCorrente " +cc2);

	}
}



