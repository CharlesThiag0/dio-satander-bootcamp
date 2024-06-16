package edu.estudos.repeticao;

import java.util.Scanner;

public class ForWhileDoWhile {

	public static void main(String[] args) {
		// Escreva um programa que imprime os números de 1 a 20. Porém, se o número for
		// par
		// , o programa deve pular a impressão usando continue

		/*
		 * for(int i = 1; i <= 20; i++) { if(i % 2 != 0) { continue; }
		 * 
		 * System.out.println(i); }
		 */

		// um programa que percorre uma lista de números inteiros e para de procurar
		// assim que encontra o número 42, usando break
//		List<Integer> numeros = new ArrayList<>();
//		for (int i = 0; i <= 50; i++) {
//			numeros.add(i);
//		}
//		for(int i = 0;!numeros.isEmpty(); i++) {
//			if(numeros.get(i) == 42) {
//				System.out.println("ENCONTRADO");
//				break;
//			}
//		}

		// screva um programa que pede ao usuário para inserir números até que ele
		// insira um número negativo.
		// O programa deve somar todos os números positivos inseridos. Se o número
		// inserido for negativo,
		// o programa deve interromper o loop usando break.
		Scanner sc = new Scanner(System.in);
//		System.out.println("Digite o numeros");
//		int total = 0;
//		int num = 0;
//
//		while(true) {
//			num = sc.nextInt();
//			
//			if(num < 0) {
//				break;
//			}
//			
//			if(num == 0) {
//				continue;
//			}
//			
//			total += num;
//		}
//		
//		System.out.println("Total: " + total);

		double numOne = sc.nextDouble();
		double numTwo = sc.nextDouble();

		try {
			System.out.println(divisao(numOne, numTwo));
		} catch (IllegalArgumentException  e) {
			System.out.println("Não podem ser negativos ou igual a 0");
		}

		sc.close();
	}

	public static double divisao(double numOne, double numTwo) throws IllegalArgumentException  {
		if (numOne <= 0 || numTwo <= 0) {
			throw new IllegalArgumentException ();
		}
		return numOne / numTwo;
	}

}
