package com.exercise2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> Map1 = new HashMap<String, Integer>();
		Map<String, String> Map2 = new HashMap<String, String>();

		int n = sc.nextInt();

		for (int i = 0; i < n; i++)
			Map1.put(sc.next(), sc.nextInt());
		for (int i = 0; i < n; i++)
			Map2.put(sc.next(), sc.next());

		String Name1 = sc.next();
		String Name2 = sc.next();

		procuraValor(Map1, Name1);
		procuraValor(Map2, Name2);
	}

	public static <T> T procuraValor(Map<String, T> mapa, String chave) {
		System.out.println(chave + " valor: " + mapa.get(chave));
		return null;
	}
}
