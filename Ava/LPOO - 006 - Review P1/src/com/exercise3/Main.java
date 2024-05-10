package com.exercise3;


import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Objeto ob = new Objeto();
		
		ob.setNome(sc.next());
		ob.setAltura(sc.nextDouble());
		ob.setLargura(sc.nextDouble());
		ob.setPeso(sc.nextDouble());
		
		System.out.println(ob);
		
		ob.setPeso(sc.nextDouble());
		System.out.println(ob);
	}
}





