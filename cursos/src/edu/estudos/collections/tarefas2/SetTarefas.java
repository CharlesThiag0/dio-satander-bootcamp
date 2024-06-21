package edu.estudos.collections.tarefas2;

import java.util.HashSet;
import java.util.Set;
import java.util.Collections;

import edu.estudos.collections.tarefas.Tarefa;

public class SetTarefas {
	private Set<Tarefa> tarefas;

	public SetTarefas() {
		this.tarefas = new HashSet();
	}

	public Set<Tarefa> getTarefas() {
		return Collections.unmodifiableSet(tarefas);
	}

	public void adicionar(String nome) {
		tarefas.add(new Tarefa(nome));
	}

	public void remover(String nome) {
		for (Tarefa t : tarefas) {
			if (t.getNome() == nome) {
				tarefas.remove(t);
				return;
			}
		}
	}
	
	public void exibir() {
		tarefas.forEach(x -> System.out.println(x));
	}

	public int contar() {
		return tarefas.size();
	}
	
	public void obterTarefasConcluidas() {
		for(Tarefa t : tarefas) {
			if(t.isConcluida()) {
				System.out.println(t);
			}
		}
	}
	
	public void obterTarefasPendentes() {
		for(Tarefa t : tarefas) {
			if(!t.isConcluida()) {
				System.out.println(t);
			}
		}
	}
	
	public void marcaTarefaConcluida(String nome) {
		for(Tarefa t : tarefas) {
			if(t.getNome() == nome) {
				t.concluir();
			}
		}
	}
	
	public void limparTarefas() {
		tarefas.clear();
	}
}
