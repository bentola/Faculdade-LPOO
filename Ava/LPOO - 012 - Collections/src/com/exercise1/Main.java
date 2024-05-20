package com.exercise1;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			List<String> lista = new LinkedList<>();
			for (int i = 0; i < 5; i++) {
				lista.add(sc.next());
			}

			System.out.println(lista);
			int n = sc.nextInt();

			System.out.println("Índice: " + n + " " + lista.get(n));
			lista.add(lista.get(n));
			lista.remove(n);
			Collections.sort(lista);
			System.out.println("Total=5 " + lista);
			sc.close();
		} catch (InputMismatchException e) {
			System.out.println("Entrada Inválida!");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Índice Inválido!");
		}

	}
}

