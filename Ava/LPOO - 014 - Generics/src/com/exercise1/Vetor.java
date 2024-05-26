package com.exercise1;

class Vetor {
	public static <T extends Comparable<T>> T maiorValor(T[] vetor) {
		T maior = vetor[0];
		for (T elements : vetor) {
			if (elements.compareTo(maior) > 0)
				maior = elements;

		}

		return maior;
	}
}
