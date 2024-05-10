package com.exercise1;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		try{
		Scanner sc = new Scanner(System.in);
		int vet[] = { 500, 1000, 1500, 3000, 5000 };
		int n = sc.nextInt();
		for (int i = 0; i < vet.length; i++) {
			System.out.printf("%d ", vet[i]/n);
		}
		}catch (ArithmeticException e) {
			System.out.println("Erro de divisão por zero");
		}catch (InputMismatchException e) {
			System.out.println("Caractere inválido");
		}
	}
}
