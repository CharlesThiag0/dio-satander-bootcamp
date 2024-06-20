package edu.estudos.collections.numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	private List<Integer> numeros = new ArrayList<>();
	
	public void addNumero(int numero) {
		numeros.add(numero);
	}
	
	public void calcularSoma() {
		int total = 0;
		for(Integer numero : numeros) {
			total += numero;
		}
		
		System.out.println("total " + total);
	}
	
	public void encontrarMaiorNumero() {
		int maior = Integer.MIN_VALUE;
		
		for(Integer numero : numeros) {
			if(maior < numero) {
				maior = numero;
			}
		}
		
		System.out.println("Maior valor " + maior);
	}

	public void encontrarMenorNumero() {
		int menor = Integer.MAX_VALUE;
		
		for(Integer numero : numeros) {
			if(menor > numero) {
				menor = numero;
			}
		}
		
		System.out.println("Menor valor " + menor);
	}
	
	public void exibirNumeros() {
		numeros.forEach(numero -> System.out.println(numero));
	}
}
