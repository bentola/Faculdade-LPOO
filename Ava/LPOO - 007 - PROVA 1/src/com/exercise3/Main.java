package com.exercise3;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta conta1 = new Conta(sc.next(),sc.nextInt(),sc.next());
		Conta conta2 = new Conta(sc.next(),sc.nextInt(),sc.next());
		
		conta1.depositar(sc.nextInt());
		conta2.depositar(sc.nextInt());
		conta1.transferir(conta2, sc.nextDouble());
		conta1.sacar(sc.nextInt());
		System.out.println(conta1);
		System.out.println(conta2);
	}
}
