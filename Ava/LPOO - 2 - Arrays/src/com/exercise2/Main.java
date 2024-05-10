package com.exercise2;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float[][] Matrix = new float[6][2];

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 2; j++) {
				Matrix[i][j] = sc.nextFloat();
			}
		}

		for (int i = 0; i < 6; i++) {
			if ((Matrix[i][1] + Matrix[i][0]) / 2 >= 6)
				System.out.printf("media=%.1f APROVADO\n", (Matrix[i][1] + Matrix[i][0]) / 2);
			else
				System.out.printf("media=%.1f REPROVADO\n", (Matrix[i][1] + Matrix[i][0]) / 2);

		}

	}
}
