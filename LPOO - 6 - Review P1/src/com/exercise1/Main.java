package com.exercise1;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetor = new int[10];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.nextInt();
			if (vetor[i] % 3 == 0 && vetor[i] >= 0)
				vetor[i] = -3;
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("X["+i+"] = "+vetor[i]);
		}
		
	}
}
