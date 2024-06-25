package edu.estudos.steam;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerEx {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		Consumer<Integer> imprimirNumeroPar = numero -> {
			if(numero % 2 == 0) {
				System.out.print(numero + " ");
			}
		};
	
//		numeros.stream().forEach(numero -> {
//			if(numero % 2 ==0) {
//				System.out.println(numero);
//			}
//		});
//		
		
		System.out.println(numeros.stream()
				                  .filter(numero -> numero % 2 == 0)
								  .collect(Collectors.toList()));
		
	}
}
