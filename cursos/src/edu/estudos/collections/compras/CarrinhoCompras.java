package edu.estudos.collections.compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
	private List<Iten> itens = new ArrayList<>();

	public void adicionarItem(String nome, double preco, int quantidade) {
		itens.add(new Iten(nome, preco, quantidade));
	}

	public void removerIten(String nome) {

		for (Iten iten : this.itens) {
			if (iten.getNome().equalsIgnoreCase(nome)) {
				if (iten.getQuantidade() > 1) {
					iten.setQuantidade(iten.getQuantidade() -1);
				} else {
					this.itens.remove(iten);
					break;
				}
			}
		}
	}

	public Double calcularValorTotal() {
		double total = 0;

		for (Iten iten : this.itens) {
			total += iten.getPreco() * iten.getQuantidade();
		}

		return total;
	}

	public void exibirItens() {
		itens.forEach(x -> System.out.println(x + " "));
	}

}
