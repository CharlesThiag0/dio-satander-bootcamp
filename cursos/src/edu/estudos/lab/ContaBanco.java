package edu.estudos.lab;

import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Por favor, digite o número da Numero !");
		Integer numero = sc.nextInt();
		
		System.out.println("Por favor, digite a Agência !");
		String agencia = sc.next();

		System.out.println("Por favor, digite seu Nome !");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.println("Por favor, digite o seu Saldo !");
		Double saldo = sc.nextDouble();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco,"
				+ " sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
				nome,
				agencia,
				numero,
				saldo);
		
		sc.close();
	}
}
