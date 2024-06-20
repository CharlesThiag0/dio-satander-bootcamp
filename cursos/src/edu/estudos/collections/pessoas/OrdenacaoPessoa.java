package edu.estudos.collections.pessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
	private List<Pessoa> pessoas;

	public OrdenacaoPessoa() {
		this.pessoas = new ArrayList<>();
	}

	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoas.add(new Pessoa(nome, idade, altura));
	}

	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoas = new ArrayList<Pessoa>(this.pessoas);

		Collections.sort(pessoas);

		return pessoas;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoas = new ArrayList<Pessoa>(this.pessoas);
		
		Collections.sort(pessoas, new ComparatorPorAltura());
		
		return pessoas;
	}

	@Override
	public String toString() {
		return "OrdenacaoPessoa [pessoas=" + pessoas + "]";
	}

	
	
	
	
}
