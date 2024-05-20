package com.exercise2;

import java.util.HashMap;
import java.util.Scanner;

public class Map {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			HashMap<String, Integer> map = new HashMap<>();

			for (int i = 0; i < 5; i++) {
				map.put(sc.next(), sc.nextInt());
			}
			String index = sc.next();
			System.out.println("Valor da chave(" + index + ")=" + map.get(index));
			System.out.println("Quantidade de elementos: " + map.size());
		} catch (NullPointerException e) {
			System.out.println("null");
		}
	}
}
