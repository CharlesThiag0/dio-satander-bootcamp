package edu.estudos.collections.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	private Map<String, String> dicionariosMap;

	public Dicionario() {
		this.dicionariosMap = new HashMap<>();
	}

	public void add(String nome, String descrição) {
			dicionariosMap.put(nome, descrição);
	}

	public void remove(String nome) {
		if (!dicionariosMap.isEmpty())
			dicionariosMap.remove(nome);
	}

	public void exibir() {
		System.out.println(dicionariosMap);
	}
	
	public String pesquisa(String palavra) {
			return dicionariosMap.get(palavra);
	}	
}
