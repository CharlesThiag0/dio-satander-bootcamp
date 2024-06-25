package edu.estudos.steam.nomes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Nome {
	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Amanda", "Bianca", "Kelly", "Ana");
		
		List<String> nomesComA = nomes.stream()
								 	  .filter(nome -> nome.startsWith("A"))
								 	  .collect(Collectors.toList());
		System.out.println(nomesComA);
	}
}
