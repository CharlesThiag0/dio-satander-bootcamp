package edu.estudos.collections.pessoas;

public class Main {

	public static void main(String[] args) {
		// Criando uma instância da classe OrdenacaoPessoas
	    OrdenacaoPessoa ordenacaoPessoas = new OrdenacaoPessoa();
   
	    // Adicionando pessoas à lista
	    ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
	    ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
	    ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
	    ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

	    // Exibindo a lista de pessoas adicionadas
	    System.out.println(ordenacaoPessoas);

	    // Ordenando e exibindo por idade
	    System.out.println(ordenacaoPessoas.ordenarPorIdade());

	    // Ordenando e exibindo por altura
	    System.out.println(ordenacaoPessoas.ordenarPorAltura());

	}

}
