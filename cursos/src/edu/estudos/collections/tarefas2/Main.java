package edu.estudos.collections.tarefas2;

public class Main {

	public static void main(String[] args) {
		 // Criando uma instância da classe ListaTarefas
	    SetTarefas listaTarefas = new SetTarefas();

	    // Adicionando tarefas à lista
	    listaTarefas.adicionar("Estudar Java");
	    listaTarefas.adicionar("Fazer exercícios físicos");
	    listaTarefas.adicionar("Organizar a mesa de trabalho");
	    listaTarefas.adicionar("Ler livro");
	    listaTarefas.adicionar("Preparar apresentação");

	    // Exibindo as tarefas na lista
	    listaTarefas.exibir();

	    // Removendo uma tarefa
	    listaTarefas.remover("Fazer exercícios físicos");
	    listaTarefas.exibir();

	    // Contando o número de tarefas na lista
	    System.out.println("Total de tarefas na lista: " + listaTarefas.contar());

	    // Obtendo tarefas pendentes
	    listaTarefas.obterTarefasPendentes();

	    // Marcando tarefas como concluídas
	    listaTarefas.marcaTarefaConcluida("Ler livro");
	    listaTarefas.marcaTarefaConcluida("Estudar Java");

	    // Obtendo tarefas concluídas
	    listaTarefas.obterTarefasConcluidas();

	    // Marcando tarefas como pendentes
	    listaTarefas.obterTarefasPendentes();
	    listaTarefas.exibir();

	    // Limpando a lista de tarefas
	    listaTarefas.limparTarefas();
	    listaTarefas.exibir();

	}

}
