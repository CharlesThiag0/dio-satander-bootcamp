package edu.estudos.collections.numeros;

public class Main {
	public static void main(String[] args) {
		SomaNumeros numeros = new SomaNumeros();
		
		numeros.addNumero(1);
		numeros.addNumero(3);
		numeros.addNumero(2);
		numeros.addNumero(4);
		numeros.addNumero(10);
		
		numeros.calcularSoma();
		
		numeros.encontrarMaiorNumero();
		
		numeros.encontrarMenorNumero();
		
		numeros.exibirNumeros();
		
	}
	
}
