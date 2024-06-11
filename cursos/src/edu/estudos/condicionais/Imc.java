package edu.estudos.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		double weight, height, imc;
		String categoryImc = "";

		System.out.println("Por favor, insira seu peso em quilogramas:");
		weight = sc.nextDouble();

		System.out.println("Por favor, insira sua altura em metros:");
		height = sc.nextDouble();

		imc = imcCalculate(weight, height);
		System.out.printf("Seu IMC é: %.2f\n", imc);

		if (imc < 18.5) {
			categoryImc = "Abaixo do peso";
		} else if (imc < 24.9) {
			categoryImc = "Peso normal";
		} else if (imc < 29.9) {
			categoryImc = "Sobrepeso ";
		} else if (imc < 34.9) {
			categoryImc = "Obesidade Grau I";
		} else if (imc < 39.9) {
			categoryImc = "Obesidade Grau II";
		} else {
			categoryImc = "Obesidade Grau III";
		}

		System.out.println("Classificação: " + categoryImc);

		sc.close();
	}

	public static double imcCalculate(double weight, double height) {
		return weight / (Math.pow(height, 2));
	}
}
