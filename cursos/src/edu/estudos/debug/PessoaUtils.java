package edu.estudos.debug;

import java.util.ArrayList;
import java.util.List;

public class PessoaUtils {
	private List<Pessoa> persons = new ArrayList<>();

	public PessoaUtils() {}
	
	public PessoaUtils(List<Pessoa> persons) {
		this.persons = persons;
	}
	
	public static List<Pessoa> criarPessoas(int amound) {
		List<Pessoa> personsNew = new ArrayList<Pessoa>();
		for(int i = 0; i < amound; i++) {
			personsNew.add(new Pessoa("Pessoa: " + i, "CPF : 12345" + i, i));
		}
		
		return personsNew;
	}
	
	public double mediaIdade() {
		double soma = 0;
		for(Pessoa pessoa : persons) {
			soma += pessoa.getAge() + 1;
		}
		
		return soma / persons.size();
	}
	
}
