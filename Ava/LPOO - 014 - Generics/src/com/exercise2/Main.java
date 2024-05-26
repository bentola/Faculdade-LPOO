package com.exercise2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> vetInt = new ArrayList<>();
		ArrayList<Double> vetDouble = new ArrayList<>();
		
		try {
		for (int i = 0; i < n; i++)
			vetInt.add(sc.nextInt());
		for (int j = 0; j < n; j++)
			vetDouble.add(sc.nextDouble());
		System.out.println("Lista Inteiros: "+vetInt);
		System.out.println("Soma Inteiros: " + somaList(vetInt));
		System.out.println("Lista Doubles: " + vetDouble);
		System.out.println("Soma Doubles: " + somaList(vetDouble));
		} catch(InputMismatchException e) {
			System.out.println("Entrada Inválida");
		}

	}

	public static double somaList(ArrayList<? extends Number> list) {
		Double soma = (double) 0;
		for (Number elements : list)
			soma += elements.doubleValue();
		return soma;
	}
}

