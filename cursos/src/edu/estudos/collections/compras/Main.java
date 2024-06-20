package edu.estudos.collections.compras;

public class Main {

	public static void main(String[] args) {
		CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
		
		carrinhoCompras.adicionarItem("Geladeira", 2000.0, 1);
		carrinhoCompras.adicionarItem("Televisão", 2000.0, 1);
		carrinhoCompras.adicionarItem("Mesa em L", 200.0, 2);
		
		carrinhoCompras.removerIten("Mesa em L");
		
		System.out.println(carrinhoCompras.calcularValorTotal());

		carrinhoCompras.exibirItens();	
	}
}
