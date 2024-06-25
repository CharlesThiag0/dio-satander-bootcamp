package edu.estudos.steam.praticas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Praticas {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		// #1
		List<Integer> numerosOrdenados = numeros.stream().sorted().collect(Collectors.toList());
		System.out.println(numerosOrdenados);
		
		// #2
		int numerosSoma = numeros.stream()
				.filter(num -> num % 2 == 0)
				.reduce(0, Integer :: sum);
		System.out.println(numerosSoma);
		
		// #3
		numeros.stream().filter(num -> num > 0).forEach(System.out :: print);
		
		System.out.println();
		
		// #4
		numeros.stream().filter(num -> num % 2 == 0).forEach(System.out :: print);;
		
		// #5
		OptionalDouble media = numeros.stream().filter(num -> num > 5)
				.mapToInt(Integer :: intValue)
				.average();
		if(media.isPresent()) {
			System.out.println("Media de: " + media.getAsDouble());
		} else {
			System.out.println("Não a numeros maiores que 5");
		}
		
		// #6
		numeros.stream()
				.filter(num -> num > 10)
				.collect(Collectors.toList())
				.forEach(System.out :: println);;
		//
		System.out.println(numeros.stream().anyMatch(num -> num > 10));
		
		// #7
		Optional<Integer> segundoMaior = numeros.stream()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst();
		 segundoMaior.ifPresent(num -> System.out.println("Segundo maior " + num));
		
		 // #8
		 int total = numeros.stream().reduce(0, Integer :: sum);
		 System.out.println(total);
		 
		 // #9
		 Set<Integer> listaNum = new HashSet<>();
		 numeros.stream().allMatch(num -> listaNum.add(num));
		 System.out.println(listaNum);
		 
		 System.out.println("---------------------");
		 
		 // #10
		 numeros.stream().filter(num -> num % 2 != 0 && (num % 3 == 0 || num % 5 == 0))
		 				 .forEach(System.out :: println);
		 
		 // #11
		 int numTotal = numeros.stream().mapToInt(num -> num * num)
		 	.sum();
		System.out.println(numTotal);
		
		// #12
		int resultadoProduto = numeros.stream().reduce(1, (a, b) -> a * b);
		System.out.println("O produto dos números é: " + resultadoProduto);
		
		// #13
		numeros.stream().filter(num -> num >= 5 && num <= 10)
		.forEach(System.out :: println);
		
		// #14
		OptionalInt numeroPrimo = numeros.stream().filter(Praticas :: isPrime)
				.mapToInt(num -> num)
				.max();
		System.out.println(numeroPrimo.isPresent() ? 
				"Maior primo " + numeroPrimo.getAsInt() : 
				"Não a numeros primos");
		
		// #15
		List<Integer> numeroNegativo = numeros.stream().filter(num -> num < 0)
				.collect(Collectors.toList());
		System.out.println(numeroNegativo.isEmpty() ?
				"Nenhum negativo" :
					"numero negativo: " + numeroNegativo.toString());
		
		// #16
		Stream.concat(listaNum.stream(), numeroNegativo.stream())
				.collect(Collectors.toList()).forEach(System.out :: println);
		
		// #17
		System.out.println("Números primos na lista:");
		numeros.stream().filter(Praticas :: isPrime)
		.collect(Collectors.toList()).forEach(System.out :: println);
	
		// #18
		boolean numerosIguais = numeros.stream()
					.distinct()
					.count() <= 1;
		System.out.println(numerosIguais == true ?
			"Todos sao numeros iguais" :
				"Não sao todos iguais");
		
		// # 19
		int numTeste = numeros.stream().filter(num -> num % 3 == 0 && num % 5 == 0)
				.mapToInt(Integer :: valueOf)
				.sum();
		System.out.println(numTeste);
		
	}
	
	public static boolean isPrime(int numero) {
		if(numero <= 1) {
			return false;
		}
		
		return IntStream.rangeClosed(2,(int) Math.sqrt(numero))
				.allMatch(num -> numero % num != 0);
	}

}
