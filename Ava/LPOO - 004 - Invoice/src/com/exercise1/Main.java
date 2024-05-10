package com.exercise1;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fatura f1 = new Fatura();
		f1.setDescricao(sc.nextLine());
		f1.setQtde(sc.nextInt());
		f1.setPreco(sc.nextDouble());
		System.out.println(f1);
	}
}


