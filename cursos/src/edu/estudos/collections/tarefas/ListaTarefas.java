package edu.estudos.collections.tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
	private List<Tarefa> tarefas = new ArrayList<>();
	
	public void adicionarTarefa(String descricao) {
		tarefas.add(new Tarefa(descricao));
	}

	public void removerTarefa(String descricao) {
		if (tarefas.isEmpty()) {
			System.out.println("Tarefas esta vazia");
		}

		for (Tarefa tarefa : tarefas) {
			if (tarefa.getNome().equalsIgnoreCase(descricao)) 
				tarefas.remove(tarefa);
		}

	}

	public Integer obterNumeroTotalTarefas() {
		return tarefas.size();
	}

	public List<String> obterDescricoesTarefas() {
		List<String> tarefas = new ArrayList<>();

		for (Tarefa tarefa : this.tarefas) {
			tarefas.add(tarefa.getNome());
		}

		return tarefas;
	}
}
