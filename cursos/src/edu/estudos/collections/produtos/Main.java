package edu.estudos.collections.produtos;

public class Main {
	public static void main(String[] args) {
		// Criando uma instância do CadastroProdutos
	    CadastroProdutos cadastroProdutos = new CadastroProdutos();

	    // Adicionando produtos ao cadastro
	    cadastroProdutos.add(1L, "Smartphone", 1000d, 10);
	    cadastroProdutos.add(2L, "Notebook", 1500d, 5);
	    cadastroProdutos.add(1L, "Mouse", 30d, 20);
	    cadastroProdutos.add(4L, "Teclado", 50d, 15);

	    // Exibindo produtos ordenados por nome
	    System.out.println(cadastroProdutos.exibirPorNome());

	    // Exibindo produtos ordenados por preço
	    System.out.println(cadastroProdutos.exibirPorPreco());
	}
}
