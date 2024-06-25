package edu.banco;

import java.util.ArrayList;
import java.util.Collection;

public class Banco {
	private String nome;
	private Collection<Conta> contas = new ArrayList<>();
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public void addCliente(Conta conta) {
		contas.add(conta);
	}
	
	public void imprimirContas() {
		contas.forEach(System.out :: println);
	}
	
}
