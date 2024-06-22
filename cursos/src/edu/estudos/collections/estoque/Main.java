package edu.estudos.collections.estoque;

public class Main {
	public static void main(String[] args) {
		EstoqueProdutos estoque = new EstoqueProdutos();
		// Adiciona produtos ao estoque
		estoque.add(1L, "Notebook", 1, 1500.0);
		estoque.add(2L, "Mouse", 5, 25.0);
		estoque.add(3L, "Monitor", 10, 400.0);
		estoque.add(4L, "Teclado", 2, 40.0);

		estoque.getProdutos();

		// Obtém e exibe o produto mais caro
		String produtoMaisCaro = estoque.produtoMaisCaro();
		System.out.println("Produto mais caro: " + produtoMaisCaro);

		// Obtém e exibe o produto mais barato
		String produtoMaisBarato = estoque.produtoMaisBarato();
		System.out.println("Produto mais barato: " + produtoMaisBarato);

		Produto produtoMaiorQuantidadeValorTotal = estoque.produtoMaiorValorTotalEstoque();
		System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);

		// Calcula e exibe o valor total do estoque
		System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

	}
}
