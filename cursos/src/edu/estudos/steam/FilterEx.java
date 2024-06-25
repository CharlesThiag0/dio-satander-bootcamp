package edu.estudos.steam;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FilterEx {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		numeros.stream()
		.filter(num -> num % 2 != 0)
		.forEach(System.out :: println);
		
		System.out.println("-- ---- -----");
		
		numeros.stream()
		.filter(num -> num % 2 == 0)
		.forEach(System.out :: println);
		
		System.out.println("------- -----");
		
		List<String> nome = Arrays.asList("Java", "C#", "C", "Go", "JavaScript", "Ruby");
		nome.stream().filter(n -> n.length() < 5)
					 .forEach(System.out :: println);
		
		 List<String> palavras = Arrays.asList("bonde", "paralelepípedo", "java", "stream");
		 
		 palavras.stream()
		.filter(l -> l.contains("a"))
		.map(String :: toUpperCase)
		.collect(Collectors.toList())
		.forEach(System.out :: println);

		List<String> nomes = Arrays.asList("João", "Maria", "José", "Ana", "Juliana", "Paulo", "Jessica");
		Optional<String> nome1 = nomes.stream().filter(n -> n.startsWith("J"))
		.findFirst();
		
		System.out.println(nome1);
	}
}
