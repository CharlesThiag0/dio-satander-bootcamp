package edu.estudos.steam;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierEx {

	public static void main(String[] args) {
		Supplier<String> saudacao = () -> "foco dev!!";
		List<String> listaSaudacao = Stream.generate(saudacao).limit(5).collect(Collectors.toList());
		listaSaudacao.forEach(x -> System.out.println(x));
		
		
		List<String> lista = Stream.generate(() -> "foco dev!!!").limit(3).toList();
		lista.forEach(System.out :: println);
		
		AtomicInteger contator = new AtomicInteger(1);
		List<String> mensagem = Stream.generate(() -> "Mensagem : " + contator.getAndIncrement())
				.limit(4)
				.toList();
		mensagem.forEach(System.out :: println);
		
		List<Integer> mensagem2 = Stream.generate(contator :: getAndIncrement)
				.limit(5)
				.toList();
		mensagem2.forEach(System.out :: println);
		
		Random random = new Random(); 
		List<String> numeros = Stream.generate(() -> "numeros : " + random.nextInt(100) + 1)
				.limit(10)
				.toList();
		numeros.forEach(System.out :: println);
		
		List<String> bons = Arrays.asList("Olá!", "Bom dia!", "Boa tarde!", "Boa noite!", "Oi!");
		List<String> teste = Stream.generate(() -> bons.get((int) (Math.random() * bons.size())))
				.limit(4)
				.toList();
		teste.forEach(System.out :: println);
		
		LocalDate localDate = LocalDate.now();
		AtomicInteger contador2 = new AtomicInteger(1);
		List<LocalDate> proximasDatas = Stream.generate(() -> localDate.plusDays(contador2.getAndIncrement()))
				.limit(3)
				.toList();
		proximasDatas.forEach(System.out :: println);	
	}

}
