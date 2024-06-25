package edu.estudos.steam;

import java.util.Arrays;
import java.util.List;

public class BinaryOperatorEx {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
		int resultado = numeros.stream().reduce(0, Integer :: sum);
		System.out.println(resultado);
		
		int resultadoSub = numeros.stream().reduce(0,(num1, num2) -> num1 - num2);
		System.out.println(resultadoSub);
	}
}
