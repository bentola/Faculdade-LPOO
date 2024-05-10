package com.exercise4;


import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Quadrado quad1 = new Quadrado();
		quad1.setNome(sc.next());
		quad1.setNumLados(sc.nextInt());
		quad1.setLado(sc.nextDouble());
		System.out.println(quad1);
		quad1.setLado(sc.nextInt());
		System.out.println(quad1);
	}
}





