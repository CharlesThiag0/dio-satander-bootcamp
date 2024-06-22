package edu.estudos.collections.agenda;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	private Map<String, Integer> contatos;

	public AgendaContatos() {
		this.contatos = new HashMap<>();
	}
	
	public void add(String nome, int numero) {
		contatos.put(nome, numero);
	}
	
	public void remove(String nome) {
		if(!contatos.isEmpty()) {
			contatos.remove(nome);
		}
	}
	
	public void exibir() {
		System.out.println(contatos);
	}
	
	public int pesquisa(String nome) {
		
		return contatos.get(nome);
	}
}
