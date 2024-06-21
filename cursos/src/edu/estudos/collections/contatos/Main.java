package edu.estudos.collections.contatos;

public class Main {
	public static void main(String[] args) {
		AgendaContato contatos = new AgendaContato();
		
		contatos.adicionarContato("arles", 3132141);
		contatos.adicionarContato("Thiago", 1132142);
		contatos.adicionarContato("Crles", 3132143);
		contatos.adicionarContato("Chaes", 1232144);
		contatos.adicionarContato("Charçes", 1231145);
		
		contatos.exibirContatos();
		System.out.println("----------------------------");
		
		System.out.println(contatos.pesquisaPorNome("Thiago"));
		
		contatos.atualizarNumeroContato("Thiago", 0000);
		contatos.exibirContatos();
	}
}
