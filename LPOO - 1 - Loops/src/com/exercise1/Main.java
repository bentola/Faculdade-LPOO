package com.exercise1;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int Number = sc.nextInt();
		int Temp = Number;
		int Result = 0;
		int Mut = 1;

		while (Number > 0) {
			Result += (Number % 2) * Mut;
			Number /= 2;
			Mut *= 10;
		}
		System.out.println(Temp + " = " + Result);

		sc.close();
	}
}
