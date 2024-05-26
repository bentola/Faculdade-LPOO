package com.exercise1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] vet1 = new Integer[n];
		String[] vet2 = new String[n];
		Vetor M = new Vetor();

		for (int i = 0; i < vet1.length; i++)
			vet1[i] = sc.nextInt();
		for (int j = 0; j < vet2.length; j++)
			vet2[j] = sc.next();

		int MaiorInt = M.maiorValor(vet1);
		String MaiorString = M.maiorValor(vet2);

		System.out.println("Maior inteiro: " + MaiorInt);
		System.out.println("Maior string: " + MaiorString);

	}
}
