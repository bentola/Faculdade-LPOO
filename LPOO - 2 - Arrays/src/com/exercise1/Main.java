package com.exercise1;


import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] Array = new int[10];
		int Ma = 0, Po = 0;

		for (int i = 0; i < Array.length; i++)
			Array[i] = sc.nextInt();

		for (int i = 0; i < Array.length; i++) {
			if (Array[i] >= Ma) {
				Ma = Array[i];
				Po = i;
			}
		}

		System.out.println("Maior=" + Ma + " posição=" + Po);
	}

}

