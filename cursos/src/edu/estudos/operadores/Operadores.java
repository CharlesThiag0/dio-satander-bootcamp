package edu.estudos.operadores;

import java.time.LocalDate;

public class Operadores {

	public static void main(String[] args) throws Exception {
		
		String name = "Charles";
		int age = 22;
		double weight = 1.83;
		char gender = 'M';
		boolean donor = false;
		LocalDate birthday = LocalDate.parse("2001-06-10");
		
		System.out.println(++age);
	
		int a, b;
		a = 10;
		b = 9;
		
		System.out.println(a == b  ? true : false);
		
		String msg = "UR5ULA K. LE GU1N - A W1ZARD 0F EARTH5EA";
		
		correct(msg);
		
		try {
			dividir(a,b);
		} catch (Exception e) {
			System.out.println("valor igual ou menor que zero não podera ser dividir");
		}
		
		
		int nota = 4;
		
		String resultado = nota >= 7 ? "Aprovado" : nota >= 5 ? "Recuperação" : "Reprovado";
		
		System.out.println(resultado);
		
		
	}
	
	public static double dividir(int a, int b) throws Exception {
		if(a <= 0 || b <= 0) {
			throw new Exception();
		}

		return (double) a / b;
	}
	
	public static String correct(String string) {
	    return string.isEmpty() || string == null ? string : string.replace("5", "S")
	                                                               .replace("1", "I")
	                                                               .replace("0", "O");
	  }

}
