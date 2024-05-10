package com.exercise1;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), pos = 0, neg = 0, media = 0;
		int[] Vetor = new int[n];
		for (int i = 0; i < n; i++) {
			Vetor[i] = sc.nextInt();
			if (Vetor[i] > 0) {
				pos++;
				media += Vetor[i];
			} else if (Vetor[i] < 0) {
				neg++;
			}
		}
		System.out.println("positivos = " + pos);
		System.out.println("negativos = " + neg);
		System.out.printf("media = %.1f \n", (double) media / pos);
	}
}
