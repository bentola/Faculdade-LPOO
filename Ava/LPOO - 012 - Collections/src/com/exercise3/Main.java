package com.exercise3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {

			Scanner sc = new Scanner(System.in);
			List<Pessoa> p1 = new ArrayList<>();
			for (int i = 0; i < 3; i++) {
				p1.add(new Pessoa(sc.next(), sc.nextInt()));
			}
			System.out.println(p1);

			int n = sc.nextInt();
			Pessoa segundaPessoa = p1.get(1);
			segundaPessoa.setIdade(n);
			System.out.println("Total=" + p1.size() + " " + p1);
		} catch (InputMismatchException e) {
			System.out.println("Entrada Inválida!");
		}
	}
}
