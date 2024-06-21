package edu.estudos.collections.contatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
	private Set<Contato> contatos;

	public AgendaContato() {
		this.contatos = new HashSet<>();
	}

	public void adicionarContato(String nome, int numero) {
		contatos.add(new Contato(nome, numero));
	}

	public void exibirContatos() {
		contatos.forEach(x -> System.out.println(x));
	}

	public Contato pesquisaPorNome(String contato) {
		Contato busca = null;

		for (Contato c : contatos) {
			if (c.getNome().equals(contato)) {
				busca = c;
			}
		}

		return busca;
	}
	
	public void atualizarNumeroContato(String nome, int novoNumero) {
		for (Contato c : contatos) {
			if (c.getNome().equals(nome)) {
				 c.setNumero(novoNumero);
				 return;
			}
		}
	}

}
