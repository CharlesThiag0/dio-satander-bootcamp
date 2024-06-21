package edu.estudos.collections.alunos;

public class Main {

	public static void main(String[] args) {
		 // Criando uma instância do GerenciadorAlunos
	    CadastroAlunos gerenciadorAlunos = new CadastroAlunos();

	    // Adicionando alunos ao gerenciador
	    gerenciadorAlunos.add("João", 7.5, 123456L);
	    gerenciadorAlunos.add("Maria", 9.0, 123457L);
	    gerenciadorAlunos.add("Carlos", 5.0, 123458L);
	    gerenciadorAlunos.add("Ana", 6.8, 123459L);

	    System.out.println(gerenciadorAlunos.exibirNome());
	    // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
	    gerenciadorAlunos.remove(000L);
	    gerenciadorAlunos.remove(123457L);

	    // Exibindo alunos ordenados por nome
	    System.out.println(gerenciadorAlunos.exibirNome());

	    // Exibindo alunos ordenados por nota
	    System.out.println(gerenciadorAlunos.exibirNota());

	}

}
