package com.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ArrayInt = new ArrayList<>();
		ArrayList<String> ArrayString = new ArrayList<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			ArrayInt.add(sc.nextInt());
		}
		for (int i = 0; i < n; i++) {
			ArrayString.add(sc.next());
		}
		removeElemento(ArrayInt);
		removeElemento(ArrayString);
	}

	public static <T> void removeElemento(List<T> list) {
		list.indexOf(list);
		for (int i = 0; i < list.size(); i++) {
			if (i%2 != 1) {
				System.out.print(list.get(i)+ " ");
			}
		}
		System.out.println("");
	}
}
