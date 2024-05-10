package com.exercise1;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cachorro dog1 = new Cachorro(sc.next(), sc.nextInt());
		Gato cat1 = new Gato(sc.next(), sc.nextInt());
		Papagaio papagaio1 = new Papagaio(sc.next(), sc.nextInt());

		System.out.println(dog1);
		System.out.println(cat1);
		System.out.println(papagaio1);
		sc.close();
	}
}
