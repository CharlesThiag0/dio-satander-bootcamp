package edu.estudos.steam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FunctionEx {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4);
		List<Integer> numerosDobrados = numeros.stream()
				.map(num -> num * 10)
				.collect(Collectors.toList());
		numerosDobrados.forEach(System.out :: println);
		
		List<String> stringNumeros = Arrays.asList("1", "2", "3","4", "5", "6");
		List<Integer> numerosString = stringNumeros.stream()
				.map(Integer :: valueOf)
				.collect(Collectors.toList());
		numerosString.forEach(System.out :: println);
		
		System.out.println("---------------------------------");
		
		List<String> stringNomes = Arrays.asList("casa", "carro", "teste","moto", "yamaha");
		List<Integer> nomesInteger = stringNomes.stream()
				.map(String :: length)
				.toList();
		nomesInteger.forEach(System.out :: println);
		List<Double> nomesDouble = nomesInteger.stream()
				.map(Double :: valueOf)
				.toList();
		nomesDouble.forEach(System.out :: println);
		
		   List<Double> celsiusTemperatures = Arrays.asList(0.0, 20.0, 30.0, 37.0, 100.0);
		   List<Double> fahrenheitTemperatures = celsiusTemperatures.stream()
				   .map(celsius -> celsius * 9/5 + 32)
				   .collect(Collectors.toList());
		   System.out.println("fahrenheitTemperatures "  + fahrenheitTemperatures );
		   System.out.println("celsiusTemperatures " + celsiusTemperatures);
		   
		   
	}
}
