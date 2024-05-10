package com.exercise2;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] Array = new int[6][6];
		for (int i = 0; i < Array.length; i++) {
			for (int j = 0; j < Array.length; j++) {
				Array[j][i] = sc.nextInt();
			}
		}

		int sum = 0, x = 0;
		for (int i = 0; i < Array.length; i++) {
			for (int j = x; j < Array.length; j++) {
				sum += Array[i][j];
				break;
			}
			x++;
		}
		System.out.println(sum);
	}
}
