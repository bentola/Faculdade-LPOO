package com.exercise2;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		try{
			
		Scanner sc = new Scanner(System.in);
		Usuario user1 = new Usuario(sc.next(), sc.nextInt());
		user1.setSenha(sc.next());
		user1.criarEmail(sc.next());
		System.out.println(user1);
		} catch (Exception InputMismatchException) {
			System.out.println("Entrada Inválida");
		}
	}
}
