package edu.estudos.collections.agenda;

public class Main {
	public static void main(String[] args) {
		AgendaContatos contatos = new AgendaContatos();
		
		contatos.add("Charless", 91191);
		contatos.add("charles", 91192);
		contatos.add("charkes", 91193);
		contatos.add("Charkes", 91194);
		contatos.exibir();
		
		contatos.remove("Charless");
		contatos.exibir();
		
		System.out.println(contatos.pesquisa("charkes"));
	}
}
