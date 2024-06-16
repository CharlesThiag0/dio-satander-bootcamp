package edu.estudos.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		// dividir
//		Double numerador = sc.nextDouble();
//		Double denominador = sc.nextDouble();
//		
//		try {
//			System.out.println("Resultado " + divisao(numerador, denominador));
//		} catch (ArithmeticException e) {
//			System.out.println("Erro: " + e.getMessage());
//		} catch (IllegalArgumentException e) {
//			System.out.println("Erro: " + e.getMessage());
//		} finally {
//			sc.close();
//		}

		// conveter texto em numero inteiro
//		String numText = sc.nextLine();
//		try {
//			System.out.println(conversorText(numText));
//		} catch (NumberFormatException e) {
//			System.out.println("Erro : " + e.getMessage());
//		} finally {
//			sc.close();
//		}
		
		// leia o conteúdo de um arquivo de texto
//		String fileName = "text.txt";
//		try {
//		//Abrindo o arquivo
//		File file = new File(fileName);
//		FileReader fileReader = new FileReader(file);
//		BufferedReader reader = new BufferedReader(fileReader);
//		
//		//Lendo linhas do arquivo e exibindo no console
//		String line;
//		while((line = reader.readLine()) != null) {
//			System.out.println(line);
//		}
//		
//		reader.close();
//		} catch (FileNotFoundException e) {
//			System.out.println("arquivo não encontrado: " + fileName);
//		} catch (IOException e) {
//			System.out.println("Erro de leitura do arquivo " + e.getMessage());
//		}
		
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
	}
	
	
	

	public static Integer conversorText(String numText) {
		for (char character : numText.toCharArray()) {
			if (!Character.isDigit(character))
				throw new NumberFormatException("não digite letras ou simbolos, porfavor digite numeros");
		}

		return Integer.parseInt(numText);
	}

	public static Double divisao(double numerador, double denominador) {
		if (numerador < 0) {
			throw new IllegalArgumentException("numerador não pode ser menor que zero");
		}

		if (denominador == 0) {
			throw new ArithmeticException("denominador não pode ser 0");
		}

		return numerador / denominador;
	}

}
