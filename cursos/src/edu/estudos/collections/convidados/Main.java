package edu.estudos.collections.convidados;

public class Main {

	public static void main(String[] args) {
		ConjuntoConvidados convidados = new ConjuntoConvidados();

		convidados.adicionarConvidado("charles", 000);
		convidados.adicionarConvidado("charle", 001);
		convidados.adicionarConvidado("charl", 002);
		convidados.exibirConvidados();
		System.out.println(convidados.contarConvidados());

		convidados.removerConvidado(2);
		convidados.exibirConvidados();

		System.out.println(convidados.contarConvidados());
	}

}
