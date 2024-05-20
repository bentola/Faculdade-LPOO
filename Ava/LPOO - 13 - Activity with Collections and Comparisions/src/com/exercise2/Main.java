package com.exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			ArrayList<Celular> listPhones = new ArrayList<>();
			for (int i = 0; i < 5; i++) {
				listPhones.add(new Celular(sc.nextInt(), sc.next(), sc.next()));
			}
			System.out.println(listPhones);
			Collections.sort(listPhones);
			System.out.println("O menor elemento é: " + listPhones.get(0));
			System.out.println(listPhones);

		} catch (Exception e) {
			System.out.println("Entrada Inválida");
		}

	}
}
