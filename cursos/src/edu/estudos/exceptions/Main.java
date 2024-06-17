package edu.estudos.exceptions;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
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

//		
//		for(int i = 0; i <= 10; i++) {
//			System.out.println(i);
//		}
//		
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		
//		try {
//			System.out.println(contar(num1, num2));
//		} catch (ParametroInvalidoException e) {
//			System.out.println(e.getMessage());
//		}

		Scanner scanner = new Scanner(System.in);

		double limiteDiario = scanner.nextDouble();

		for (int i = 1; ; i++) {

			double valorSaque = scanner.nextDouble();

			if (valorSaque == 0) {
				System.out.println("Transacoes encerradas.");
				break;
			} else if (valorSaque > limiteDiario) {
				System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
				break;
			} else {
				limiteDiario -= valorSaque;
				System.out.println(String.format("Saque realizado. Limite restante: %.1f", limiteDiario));
			}
		}

		scanner.close();

	}

	public static Integer contar(int num1, int num2) throws ParametroInvalidoException {
		if (num1 > num2) {
			throw new ParametroInvalidoException("Erro : PARAMETROS INVALIDOS");
		}

		return num1 - num2;
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
