package com.exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();

			ArrayList<Integer> A = new ArrayList<>();
			ArrayList<Integer> B = new ArrayList<>();
			ArrayList<Integer> C = new ArrayList<>();

			for (int i = 0; i < n; i++) {
				A.add(sc.nextInt());
			}
			C.addAll(A);
			for (int i = 0; i < n; i++) {
				B.add(sc.nextInt());
				if (!C.contains(B.get(i))) 
					C.add(B.get(i));
				
			}
for (int i = 0; i < C.size(); i++) {
				System.out.print(C.get(i) + " ");
			}
			} catch (Exception e) {
			System.out.println("Entrada Inválida");
		}

	}
}

